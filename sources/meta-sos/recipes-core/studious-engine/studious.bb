Description = "A Platform Agnostic Graphics Engine for OpenGL"
DESCRIPTION = "A C++ graphics engine for use with OpenGL and OpenGL ES"

LICENSE = "MIT"

inherit cmake

DEPENDS = " libsdl2 libsdl2-mixer libsdl2-image freetype glm mesa-gl libglu "

SRC_URI = "git://github.com/alec-jackson/studious-engine.git;protocol=https;branch=main"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4a35305fb2fe33b15b6671499cc1c8b5"

SRCREV = "3eed31bb92774fd44abb4f48255cd41dd19b1a6c"

PV = "v0.5.0"
