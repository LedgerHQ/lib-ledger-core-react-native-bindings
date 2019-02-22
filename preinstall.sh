#!/bin/bash
# shellcheck disable=SC2155

#                    lib-ledger-core-react-native-bindings
#                    =====================================
#                              Preinstall script
#

LIB_CORE_VERSION="2.6.0"
BASE_URL="https://s3-eu-west-1.amazonaws.com/ledger-lib-ledger-core"

function main() {
  #  lib file                             architecture            destination       arch override
  #  ---------------------------------------------------------------------------------------------
  dl "ledger-core.framework/ledger-core"  "ios/x86_64"            "ios/Frameworks"  "x86"
  dl "ledger-core.framework/Info.plist"   "ios/x86_64"            "ios/Frameworks"  "x86"
  dl "ledger-core.framework/ledger-core"  "ios/armv7"             "ios/Frameworks"
  dl "ledger-core.framework/Info.plist"   "ios/armv7"             "ios/Frameworks"
  dl "ledger-core.framework/ledger-core"  "ios/arm64"             "ios/Frameworks"
  dl "ledger-core.framework/Info.plist"   "ios/arm64"             "ios/Frameworks"
  dl "ledger-core.framework/ledger-core"  "ios/universal"         "ios/Frameworks"
  dl "ledger-core.framework/Info.plist"   "ios/universal"         "ios/Frameworks"
  dl "libledger-core.so"                  "android/x86"           "android/libs"
  dl "libledger-core.so"                  "android/armeabi-v7a"   "android/libs"
  dl "libledger-core.so"                  "android/arm64-v8a"     "android/libs"
}

function dl() {
  local libFile=$1
  local fullArchitecture=$2
  local architecture=$(echo "$fullArchitecture" | sed 's/.*\///g')
  local destination="$3"
  local archOverride="$4"

  if [[ $archOverride != "" ]]; then
    architecture=$archOverride
  fi

  local url="$BASE_URL/$LIB_CORE_VERSION/$fullArchitecture/$libFile"
  local outputFolder="$destination/$architecture"

  mkdir -p "$outputFolder"
  if [[  "$fullArchitecture" =~ "ios" ]]; then
    mkdir -p "$outputFolder/ledger-core.framework"
  fi

  local outputFile="$outputFolder/$libFile"
  echo -e "\\e[32m>> \\e[34m$fullArchitecture\\e[0m - \\e[35m$url\\e[0m"

  if ! curl \
    --fail \
    --max-time 600 \
    --output "$outputFile" \
    "$url"; \
  then
    echo "[x] Failed to download $url"
    exit 1
  fi

  if [[ ! "$outputFile" =~ Info.plist ]]; then
    chmod +x "$outputFile"
  fi
}

main
