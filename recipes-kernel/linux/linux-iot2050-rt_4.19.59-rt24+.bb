#
# Copyright (c) Siemens AG, 2018
#
# This file is subject to the terms and conditions of the MIT License.  See
# COPYING.MIT file in the top-level directory.
#

require linux-iot2050_4.19.59+.bb

SRC_URI += "file://rt-0001-rt-patch-for-IOT2050-kernel.patch"

KERNEL_DEFCONFIG = "iot2050_defconfig_base-rt"
