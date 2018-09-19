#!/bin/bash
# shellcheck disable=SC2155

#                    lib-ledger-core-react-native-bindings
#                    =====================================
#                              Preinstall script
#

LIB_CORE_VERSION="1.1.0"
BASE_URL="https://s3-eu-west-1.amazonaws.com/ledger-lib-ledger-core"

function main() {
  #  lib file                 architecture            destination       arch override
  #  --------------------------------------------------------------------------------
  dl "libledger-core.dylib"   "ios/x86_64"            "ios/Libraries"   "x86"
  dl "libledger-core.dylib"   "ios/armv7"             "ios/Libraries"
  dl "libledger-core.dylib"   "ios/arm64"             "ios/Libraries"
  dl "libledger-core.so"      "android/x86"           "android/libs"
  dl "libledger-core.so"      "android/armeabi-v7a"   "android/libs"
  dl "libledger-core.so"      "android/arm64-v8a"     "android/libs"
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
  local outputFile="$outputFolder/$libFile"

  echo -e "\\e[32m>> \\e[34m$fullArchitecture\\e[0m - \\e[35m$url\\e[0m"

  if ! curl \
    --fail \
    --max-time 10 \
    --output "$outputFile" \
    "$url"; \
  then
    echo "[x] Failed to download $url"
    exit 1
  fi

  chmod +x "$outputFile"
}

main
