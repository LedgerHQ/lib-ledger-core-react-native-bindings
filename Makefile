all: ios

clean:
	-rm -rf build/
	-rm -rf build_ios/

build_ios/binding.xcodeproj: binding.gyp
	PYTHONPATH=gyp/pylib gyp/gyp binding.gyp -DOS=ios --depth=. -f xcode --generator-output=./build_ios -Icommon.gypi

xb-prettifier := $(shell command -v xcpretty >/dev/null 2>&1 && echo "xcpretty -c" || echo "cat")

ios: build_ios/binding.xcodeproj
	xcodebuild -project build_ios/binding.xcodeproj -configuration Release -target libledger-core-objc | ${xb-prettifier}

cleanup_gyp: gyp binding.gyp
	gyp/tools/pretty_gyp.py binding.gyp > ledger-core-objc_tmp.gyp && mv ledger-core-objc_temp.gyp binding.gyp
