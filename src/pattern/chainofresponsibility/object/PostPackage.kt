package pattern.chainofresponsibility.`object`

import pattern.chainofresponsibility.enums.PostType

open class PostPackage constructor(
    val postType: PostType,
    val weight: Float,
    val length: Float,
    val width: Float,
    val height: Float
)