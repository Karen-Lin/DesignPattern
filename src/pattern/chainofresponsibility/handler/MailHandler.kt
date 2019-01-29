package pattern.chainofresponsibility.handler

import pattern.chainofresponsibility.`object`.PostPackage
import pattern.chainofresponsibility.enums.PostType

class MailHandler(var handler: PostHandler?) : PostHandler {

    private val maxWeight: Float = 2F //kg

    private val maxSize: Float = 60F * 60 * 60 //cm
    private val minSize: Float = 14F * 9F * 0.1F //cm

    override fun handlePackage(postPackage: PostPackage) {
        if (isStandard(postPackage)) {
            println("信件分類給郵差")
        } else {
            handler?.handlePackage(postPackage) ?: println("規格不符，退回")
        }
    }

    private fun isStandard(postPackage: PostPackage): Boolean {
        val mailSize = postPackage.length * postPackage.width * postPackage.height

        return postPackage.postType == PostType.MAIL
                && postPackage.weight <= maxWeight
                && (mailSize > minSize && mailSize <= maxSize)
    }

}