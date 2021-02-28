
SUMMARY = "A toolkit for making real world machine learning and data analysis applications"
HOMEPAGE = "https://github.com/davisking/dlib"
AUTHOR = "Davis King <davis@dlib.net>"
LICENSE = ""
LIC_FILES_CHKSUM = "file://setup.py;md5=01b72006cd763004197c457cca674d25"

SRC_URI = "https://files.pythonhosted.org/packages/99/2c/ef681c1c717ace11040f9e99fe22dafc843cdd6085eb6120e7ab2a5c662b/dlib-19.21.1.tar.gz"
SRC_URI[md5sum] = "1e7e357d7d54e86267ef60f606cb40e1"
SRC_URI[sha256sum] = "6c461e1e9e03d35a569163a41500381806a449bb34a06f18700bd7658aed8c8d"

S = "${WORKDIR}/dlib-19.21.1"

RDEPENDS_${PN} = ""

inherit setuptools
