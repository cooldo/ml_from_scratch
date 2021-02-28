
SUMMARY = "Powerful data structures for data analysis, time series, and statistics"
HOMEPAGE = "https://pandas.pydata.org"
AUTHOR = " <>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c2a8f987b2ce77c368c6b3e1b5b10774"

SRC_URI = "https://files.pythonhosted.org/packages/78/e4/a935f1701fac697c6c5458f86968bec5d2b4cb66e7f738225216ebaa20b4/pandas-1.2.2.tar.gz"
SRC_URI[md5sum] = "b208b659aa2f3b0c238bbb2669d6778b"
SRC_URI[sha256sum] = "14ed84b463e9b84c8ff9308a79b04bf591ae3122a376ee0f62c68a1bd917a773"

S = "${WORKDIR}/pandas-1.2.2"

RDEPENDS_${PN} = "python-python-dateutil python-pytz python-numpy"

inherit setuptools
