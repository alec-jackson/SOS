Description = "A Platform Agnostic Graphics Engine for OpenGL"
DESCRIPTION = "A C++ graphics engine for use with OpenGL and OpenGL ES"

LICENSE = "MIT"

inherit cmake

DEPENDS = " glew libsdl2 libsdl2-mixer libsdl2-image freetype glm"

SRC_URI = "git://github.com/alec-jackson/studious-engine.git;protocol=https;branch=main"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4a35305fb2fe33b15b6671499cc1c8b5"

SRCREV = "4edc9fb94aa5cbf5affd73e8049370ca01b61e5c"

S = "${WORKDIR}/git"

