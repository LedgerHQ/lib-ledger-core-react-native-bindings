import platform
import urllib
import os

exit()

# TODO: make s3 repo public

libCoreVersion = "1.1.0"
baseURL = "https://s3-eu-west-1.amazonaws.com/ledger-lib-ledger-core"
filePath = ""

userPlatform = platform.system()

bucketFile = ""
filePath = libCoreVersion + "/ios"
bucketFile = "libledger-core.dylib"

opener = urllib.URLopener()

endpointURL = baseURL + "/" + filePath
finalFile = "lib/" + bucketFile

if not os.path.exists("lib"):
    os.makedirs("lib")

print('Downloading ' + endpointURL + "/" + bucketFile + ' ...')
opener.retrieve(endpointURL + "/" + bucketFile, finalFile)

os.chmod(finalFile, 0755)
