SUMMARY = "Provides both a high- and low-level interface to the HDF5 library from Python."
HOMEPAGE = "https://www.h5py.org/"
SECTION = "devel/python"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=113251d71fb0384712c719b567261c5c"

SRC_URI[sha256sum] = "8752d2814a92aba4e2b2a5922d2782d0029102d99caaf3c201a566bc0b40db29"

SRC_URI:append = " \
           file://0001-setup_build.py-avoid-absolute-path.patch \
          "

inherit pkgconfig pypi setuptools3

BBCLASSEXTEND = "native"

DEPENDS = "python3-pkgconfig-native \
           python3-cython-native \
           python3-numpy-native \
           python3-six-native \
           hdf5-native \
           python3 \
           hdf5 \
          "

RDEPENDS:${PN} = "python3-numpy \
                  python3-six \
                  python3-json \
                 "

export HDF5_VERSION="1.8.21"

# h5py/_errors.c:2115:64: error: passing argument 3 of ?H5Ewalk2? from incompatible pointer type [-Wincompatible-pointer-types]
# h5py/_errors.c:2365:66: error: passing argument 3 of ?H5Ewalk2? from incompatible pointer type [-Wincompatible-pointer-types]
BUILD_CFLAGS += "-Wno-error=incompatible-pointer-types"
