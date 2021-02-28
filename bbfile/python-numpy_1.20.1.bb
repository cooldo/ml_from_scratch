
SUMMARY = "NumPy is the fundamental package for array computing with Python."
HOMEPAGE = "https://www.numpy.org"
AUTHOR = "Travis E. Oliphant et al. <>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=aa1ecaef18152f75bfae546b29c49d3c"

SRC_URI = "https://files.pythonhosted.org/packages/d2/48/f445be426ccd9b2fb64155ac6730c7212358882e589cd3717477d739d9ff/numpy-1.20.1.zip"
SRC_URI[md5sum] = "30ea1c7868e73eeff2c86ac465311220"
SRC_URI[sha256sum] = "3bc63486a870294683980d76ec1e3efc786295ae00128f9ea38e2c6e74d5a60a"

S = "${WORKDIR}/numpy-1.20.1"

RDEPENDS_${PN} = ""

inherit setuptools
