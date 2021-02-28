
SUMMARY = "World timezone definitions, modern and historical"
HOMEPAGE = "http://pythonhosted.org/pytz"
AUTHOR = "Stuart Bishop <stuart@stuartbishop.net>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=1a67fc46c1b596cce5d21209bbe75999"

SRC_URI = "https://files.pythonhosted.org/packages/b0/61/eddc6eb2c682ea6fd97a7e1018a6294be80dba08fa28e7a3570148b4612d/pytz-2021.1.tar.gz"
SRC_URI[md5sum] = "8c849bdf95414fe708a84473e42d4406"
SRC_URI[sha256sum] = "83a4a90894bf38e243cf052c8b58f381bfe9a7a483f6a9cab140bc7f702ac4da"

S = "${WORKDIR}/pytz-2021.1"

RDEPENDS_${PN} = ""

inherit setuptools
