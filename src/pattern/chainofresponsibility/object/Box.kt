package pattern.chainofresponsibility.`object`

import pattern.chainofresponsibility.enums.PostType

class Box : PostPackage(
    PostType.PACKAGE,
    20f,
    60F,
    60F,
    30F
)