require 'json'

package = JSON.parse(File.read(File.join(__dir__, 'package.json')))

Pod::Spec.new do |s|
  s.name                = 'ledger-core-objc'
  s.version             = package['version']
  s.summary             = package['description']
  s.homepage            = 'https://github.com/LedgerHQ/lib-ledger-core-react-native-bindings'
  s.license             = package['license']
  s.author              = 'Ledger'
  s.source              = { :git => 'https://github.com/LedgerHQ/lib-ledger-core-react-native-bindings.git', :tag => "v#{package['version']}" }
  s.platform            = :ios, '8.0'
  s.source_files         = 'ios/**/*.{h,mm,hpp}'

  s.vendored_library    = 'libdjinni_objc.a'

  s.dependency          'djinni_objc'

end
