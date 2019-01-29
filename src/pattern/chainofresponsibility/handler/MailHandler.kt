package pattern.chainofresponsibility.handler

import pattern.chainofresponsibility.`object`.PostPackage
import pattern.chainofresponsibility.enums.PostType

//TODO PostHandler
class MailHandler() {

    private val maxWeight: Float = 2F //kg

    private val maxSize: Float = 60F * 60 * 60 //cm
    private val minSize: Float = 14F * 9F * 0.1F //cm

    // 1. 如果郵件 isStandard ，println("信件分類給郵差")
    // 2. 不符合給下個人處理
    // 3. 如果沒有下個人可以處理 println("規格不符，退回")

    private fun isStandard(postPackage: PostPackage): Boolean {
        val mailSize = postPackage.length * postPackage.width * postPackage.height

        return postPackage.postType == PostType.MAIL
                && postPackage.weight <= maxWeight
                && (mailSize > minSize && mailSize <= maxSize)
    }

}