require 'json'

package = JSON.parse(File.read(File.join(__dir__, 'package.json')))

Pod::Spec.new do |s|
  s.name                = 'RNLibLedgerCore'
  s.version             = package['version']
  s.summary             = package['description']
  s.homepage            = 'https://github.com/LedgerHQ/lib-ledger-core-react-native-bindings'
  s.license             = package['license']
  s.author              = 'Ledger'
  s.source              = { :git => 'https://github.com/LedgerHQ/lib-ledger-core-react-native-bindings.git', :tag => "v#{package['version']}" }
  s.requires_arc        = true
  s.platform            = :ios, '8.0'
  s.source_files         = 'ios/**/*.{h,m}'

  s.vendored_frameworks = 'ios/Frameworks/universal/ledger-core.framework'
  s.vendored_library    = 'libledger-core-objc.a'

  s.dependency          'ledger-core-objc'
  s.dependency          'React'
end
