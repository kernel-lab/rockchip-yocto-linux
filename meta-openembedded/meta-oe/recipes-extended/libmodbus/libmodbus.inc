SUMMARY = "A Modbus library"
DESCRIPTION = "libmodbus is a C library designed to provide a fast and robust \
implementation of the Modbus protocol. It runs on Linux, Mac OS X, FreeBSD, \
QNX and Windows."
HOMEPAGE = "http://www.libmodbus.org/"
SECTION = "libs"

LICENSE = "LGPL-2.1-or-later"
LIC_FILES_CHKSUM = "file://COPYING.LESSER;md5=4fbd65380cdd255951079008b364516c"

SRC_URI = " \
    http://libmodbus.org/releases/${BP}.tar.gz \
    file://CVE-2024-10918-01.patch \
    file://CVE-2024-10918-02.patch \
    file://CVE-2024-10918-03.patch \
"

PACKAGECONFIG ??= ""
PACKAGECONFIG[documentation] = "--with-documentation,--without-documentation,asciidoc-native xmlto-native"

inherit autotools pkgconfig
