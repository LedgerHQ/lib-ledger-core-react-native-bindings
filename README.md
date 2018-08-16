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

Once set as described above, to use this react native binding:
 - drag and drop `RNLibLedgerCore.xcodeproj` under your `Libraries`'s xcodeproj,
 - add `RNLibLedgerCore` to your `Target Dependencies`'s xcodeproj section,
 - add `libRNLibLedgerCore.a` to your `Link Binary With Libraries`'s xcodeproj section,
 - add `libledger-core.dylib` (under `LibLedgerCore/lib`) to your `Frameworks`'s and `Embeded Binaries` xcodeproj sections,
 - add dynamic library's path to `Library Search Paths` section: `$(SRCROOT)/PATH_TO_DYLIB`.

## Call binding from JS side

Import native modules:
```
import { NativeModules } from "react-native";
```
Then you can access the native module :
```
NativeModules.ModuleName
```
Native Module's name is the one of corresponding react native binding interface's name which is located under `src/react-native`, for example to access native module of a wallet pool (src/react-native/RCTCoreLGWalletPool.h) you can call fron JS side: `NativeModules.CoreLGWalletPool`
### Example
```
import { NativeModules } from "react-native";
const {
  CoreLGSecp256k1,
  CoreLGHttpClient,
  CoreLGWebSocketClient,
  CoreLGPathResolver,
  CoreLGLogPrinter,
  CoreLGThreadDispatcher,
  CoreLGRandomNumberGenerator,
  CoreLGDatabaseBackend,
  CoreLGDynamicObject,
  CoreLGWalletPool,
} = NativeModules;

createWalletInstance = async () => {

  /*
  Platform specific interfaces, fully implemented in Objective-C
  */
  const httpClient = await CoreLGHttpClient.new();
  const webSocket = await CoreLGWebSocketClient.new();
  const pathResolver = await CoreLGPathResolver.new();
  const logPrinter = await CoreLGLogPrinter.new();
  const threadDispatcher = await CoreLGThreadDispatcher.new();
  const rng = await CoreLGRandomNumberGenerator.new();

  /*
  Common interfaces, fully implemented in C++
  */
  const backend = await CoreLGDatabaseBackend.getSqlite3Backend();
  const dynamicObject = await CoreLGDynamicObject.newInstance();

  //Instantiate wallet pool
  const walletPoolInstance = await CoreLGWalletPool.newInstance(
    "ledger_live_desktop",
    "",
    httpClient,
    webSocket,
    pathResolver,
    logPrinter,
    threadDispatcher,
    rng,
    backend,
    dynamicObject,
  );

  console.log(" >>> Wallet Pool Instance");
  console.log(walletPoolInstance);

  const currency = await CoreLGWalletPool.getCurrency(
    walletPoolInstance,
    "bitcoin",
  );

  const config = await CoreLGDynamicObject.newInstance();

  //Instantiate wallet 
  console.log(" >>> createWallet");
  const wallet = await CoreLGWalletPool.createWallet(
    walletPoolInstance,
    "WALLET_IDENTIFIER",
    currency,
    config,
  );

  console.log(" >>> Wallet Instance ");
  console.log(wallet);
  return wallet;
};
```
