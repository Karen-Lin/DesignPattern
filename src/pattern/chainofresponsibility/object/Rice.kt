package pattern.chainofresponsibility.`object`

import pattern.chainofresponsibility.enums.PostType

class Rice : PostPackage(
    PostType.POST_CARD,
    0.001F,
    0.1f,
    0.1f,
    0.1f
)