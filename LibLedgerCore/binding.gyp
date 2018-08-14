{
	'variables': {
		'core_library%': "..",
		'run_path%': "lib",
		'header_path%': "../src/objc",
	},
	'targets': [
		{
			'target_name': 'libledger-core-objc',
			'type': 'static_library',
			'conditions': [],
			'dependencies': [
				'../djinni/support-lib/support_lib.gyp:djinni_objc'
			],
			'sources': [
				"<!@(python glob.py ../src/objc *.h *.m *.mm)",
				"<!@(python glob.py ../src/objcpp *.h *.m *.mm)",
				"<!@(python glob.py ../src/objc-impl *.h *.m *.mm)",
			],
            'include_dirs': [
				"<@(core_library)/include",
				"<@(header_path)",
			],
			'all_dependent_settings': {
				'include_dirs': [
				  "<@(core_library)/include",
				  "<@(header_path)",
				],
			},
			# 'libraries': ['<!(pwd)/<@(run_path)/libledger-core.dylib'],
			'libraries': [
				'-L<(module_root_dir)/lib',
				'-lledger-core'
			],
			'xcode_settings': {
				'GCC_ENABLE_CPP_EXCEPTIONS': 'YES',
				'OTHER_CFLAGS': [
					'-ObjC++',
					'-std=c++14',
				],
				# 'OTHER_LDFLAGS': [
				# 	'-framework IOKit',
				# 	'-framework CoreFoundation',
				# 	'-Xlinker -rpath -Xlinker @loader_path/'
				# ],
			},
		},
  ],
}
