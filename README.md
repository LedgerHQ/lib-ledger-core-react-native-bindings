# React Native Binding for Ledger Core Library

This repository provides a xcodeproj which represents a react native binding to [Ledger Core Library](https://github.com/LedgerHQ/lib-ledger-core)
## Project Structure
```
.
├── include              # includes for Ledger Core Library
├── src                  # bindings sources
    ├── objc             # bindings objective-c (generated automatically)
    ├── objc-cpp         # used by bindings objective-c (generated automatically)
    ├── objc-impl        # implementations of platform specific interfaces
    ├── react-native     # bindings react native (generated automatically)
├── LibLedgerCore        # react native binding build scripts and artifacts
    ├── binding.gyp      # clled during yarn phase, generates static libraries
    ├── Makefile         # called during make phase, generates binding.xcodeproj
    ├── build            # static libraries location
    ├── build_ios        # binding.xcodeproj location
    ├── ios              # contains react native binding xcodeproj
        ├── RNLibLedgerCore.xcodeproj
```
## Clone project

```
git clone --recurse-submodules https://github.com/valpinkman/lib-ledger-core-react-native-bindings.git
```
If you cloned this repository but without `--recurse-submodules` option, make sure to init all submodules by running:
```
git submodule init
git submodule update --init
```
## Dependencies

Under `LibLedgerCore` install all dependencies:
```
yarn
```
This will also build the objective-c binding static libraries that RN binding is using. Generated artifacts are under `build`

## Create binding.xcodeproj

To generate the xcodeproj that will be handling the objective-c binding part, run:
```
make
```
This will generate a `binding.xcodeproj` under `build_ios`.

### Use React Native binding

Once set as described above, to use this react native binding, simply drag and drop `RNLibLedgerCore.xcodeproj` under your `Libraries`'s xcodeproj and add `libledger-core.dylib` (under `LibLedgerCore/lib`) to your `Frameworks`'s xcodeproj.

## Call binding from JS side

Import native modules:
```
import { NativeModules } from "react-native";
```
Then you can access the native module :
```
NativeModules.ModuleName
```
Native Module's name is the one of corresponding react native binding interface's name which is located under `src/react-native`, for example to access native module of a wallet pool (src/react-native/RCTCoreLGWalletPool.h) you can call fron JS side: `NativeModules.CoreLGWalletPool` (This part is not tested yet)
