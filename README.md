# React Native Binding for Ledger Core Library

This repository provides a react native binding to [Ledger Core Library](https://github.com/LedgerHQ/lib-ledger-core)
## Project Structure
```
.
├── include                       # includes for Ledger Core
├── binding.gyp                   # clled during yarn phase, generates static libraries
├── Makefile                      # called during make phase, generates binding.xcodeproj
├── build                         # static libraries location
├── build_ios                     # binding.xcodeproj location
├── support-lib                   # sources for djinni objc support
├── ios                           # contains react native ios binding (xcodeproj)
│   |── RNLibLedgerCore.xcodeproj
│   └── Sources
│   │   ├── objc                  # bindings objective-c (generated automatically)
│   │   ├── objc-cpp              # used by bindings objective-c (generated automatically)
│   │   ├── objc-impl             # implementations of platform specific interfaces
│   │   ├── java                  # used by bindings java (generated automatically)
│   │   └── react-native-ios      # bindings react native ios (generated automatically)
│   └── Libraries                 # contains dynamic libraries (libledger-core.dylib)             
│
└── android                       # contains react native android binding (gradle)
    │── src/main/java             
    │    ├── co/ledger/core        # bindings java
    │    └── com/ledger/reactnative# bindings react native
    └── libs                       # contains shared libraries (libledger-core.so built with jni support)             
```

## Use React Native iOS binding

 - add `RNLibLedgerCore.xcodeproj` under your `Libraries`'s xcodeproj,
 - add `RNLibLedgerCore` to your `Target Dependencies`'s xcodeproj section,
 - add `libRNLibLedgerCore.a` to your `Link Binary With Libraries`'s xcodeproj section,
 - add `libledger-core.dylib` (under `ios/Libraries`) to your `Frameworks`'s and `Embeded Binaries` xcodeproj sections,
 - add dynamic library's path to `Library Search Paths` section: `$(SRCROOT)/PATH_TO_DYLIB`.


## Use React Native Android binding

  - include `react-native-ledger-core` in your app's gradle project, in `settings.gradle` add :
    ```
    include ':react-native-ledger-core'
    project(':react-native-ledger-core').projectDir = new File(rootProject.projectDir, '../node_modules/@ledgerhq/react-native-ledger-core/android')
    ```

  - add `react-native-ledger-core` to your app module's dependencies, in `build.gradle` add :
    ```
    compile project(':react-native-ledger-core')
    ```
  - load shared library in your app, e.g. in your `MainApplication.java` add:
  ```
  static {
    try {
      System.loadLibrary("ledger-core");
    } catch (UnsatisfiedLinkError e) {
      System.err.println("ledger-core native library failed to load: " + e);
      System.exit(1);
    }
  }
  ```
  - export package by adding `RCTCoreBindingPackage` to list of packages of your `MainApplication.java`


## Call binding from JS side

   Import native modules:
   ```
   import { NativeModules } from "react-native";
   ```
   Then you can access the native module :
   ```
   NativeModules.ModuleName
   ```
### iOS
   Native Module's name is the one of corresponding react native binding interface's name which is located under `ios/Sources/react-native-ios`, for example to access native module of a wallet pool (ios/Sources/react-native-ios/RCTCoreLGWalletPool.h) you can call from JS side: `NativeModules.CoreLGWalletPool`
### Android
  Same but classes are the ones located under `android/src/main/java/com/ledger/reactnative`, for example you can call from JS side: `NativeModules.CoreWalletPool`
  (This will change later so modules will have same name)

### Example (iOS)
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
