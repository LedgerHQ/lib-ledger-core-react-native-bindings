require 'json'

package = JSON.parse(File.read(File.join(__dir__, 'package.json')))

Pod::Spec.new do |s|
  s.name                = package['name']
  s.version             = package['version']
  s.summary             = package['description']
  s.homepage            = 'https://github.com/LedgerHQ/lib-ledger-core-react-native-bindings'
  s.license             = package['license']
  s.author              = package['author']
  s.source              = { :git => 'https://github.com/LedgerHQ/lib-ledger-core-react-native-bindings.git', :tag => "v#{package['version']}" }
  s.requires_arc        = true
  s.platform            = :ios, '10.0'
  s.pod_target_xcconfig = { 'ENABLE_BITCODE' => 'NO' }
  s.source_files        = 'ios/*.{h,m,mm}'
  s.dependency          'React'
end
