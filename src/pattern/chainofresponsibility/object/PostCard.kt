package pattern.chainofresponsibility.`object`

import pattern.chainofresponsibility.enums.PostType

class PostCard : PostPackage(
    PostType.POST_CARD,
    0.01F,
    14F,
    10F,
    0.5F
)