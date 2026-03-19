Description = "A Platform Agnostic Graphics Engine for OpenGL"
DESCRIPTION = "A C++ graphics engine for use with OpenGL and OpenGL ES"

LICENSE = "MIT"

inherit cmake

DEPENDS = " glew libsdl2 libsdl2-mixer libsdl2-image freetype glm"

SRC_URI = "git://github.com/alec-jackson/studious-engine.git;protocol=https;branch=main"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4a35305fb2fe33b15b6671499cc1c8b5"

SRCREV = "d75ec385c27764af58a5881f177cc7873fd2fb37"

PV = "1.0.0"

S = "${WORKDIR}/git"

