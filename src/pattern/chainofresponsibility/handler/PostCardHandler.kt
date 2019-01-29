package pattern.chainofresponsibility.handler

import pattern.chainofresponsibility.`object`.PostPackage
import pattern.chainofresponsibility.enums.PostType

//TODO PostHandler
class PostCardHandler() {

    private val maxWeight: Float = 0.18F //kg

    private val maxSize: Float = 14.8F * 10.5F * 1 //cm
    private val minSize: Float = 14F * 9F * 0.1F //cm

    // 1. 如果 明信片 isStandard ，println("明信片分類給郵差")
    // 2. 不符合給下個人處理
    // 3. 如果沒有下個人可以處理 println("規格不符，退回")

    private fun isStandard(postPackage: PostPackage): Boolean {
        val postCardSize = postPackage.length * postPackage.width * postPackage.height

        return postPackage.postType == PostType.POST_CARD
                && postPackage.weight <= maxWeight
                && (postCardSize > minSize && postCardSize <= maxSize)
    }

}