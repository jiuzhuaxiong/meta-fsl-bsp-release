include recipes-multimedia/gstreamer/gstreamer1.0-plugins-base.inc

FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/files:"
FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/${PN}:"

LIC_FILES_CHKSUM = "file://COPYING;md5=c54ce9345727175ff66d17b67ff51f58 \
                    file://COPYING.LIB;md5=6762ed442b3822387a51c92d928ead0d \
                    file://common/coverage/coverage-report.pl;beginline=2;endline=17;md5=a4e1830fce078028c8f0974161272607"

SRC_URI = " \
    http://gstreamer.freedesktop.org/src/gst-plugins-base/gst-plugins-base-${PV}.tar.xz \
    file://make-gio_unix_2_0-dependency-configurable.patch \
"

SRC_URI[md5sum] = "77f5379c4ca677616b415e3b3ff95578"
SRC_URI[sha256sum] = "5067dce3afe197a9536fea0107c77213fab536dff4a213b07fc60378d5510675"

S = "${WORKDIR}/gst-plugins-base-${PV}"
