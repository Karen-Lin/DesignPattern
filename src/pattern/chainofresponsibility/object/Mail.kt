package pattern.chainofresponsibility.`object`

import pattern.chainofresponsibility.enums.PostType

class Mail : PostPackage(
    PostType.MAIL,
    1f,
    30F,
    30F,
    0.3F
)