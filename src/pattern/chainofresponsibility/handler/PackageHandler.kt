package pattern.chainofresponsibility.handler

import pattern.chainofresponsibility.`object`.PostPackage
import pattern.chainofresponsibility.enums.PostType

class PackageHandler(var handler: PostHandler?) : PostHandler {

    private val maxWeight: Float = 20F //kg
    private val maxSum: Float = 150F //長+寬+高的總和 cm
    private val minSize: Float = 14F * 9F * 0.1F //cm

    override fun handlePackage(postPackage: PostPackage) {
        if (isStandard(postPackage)) {
            println("包裹分類給郵車")
        } else {
            handler?.handlePackage(postPackage) ?: println("規格不符，退回")
        }
    }

    private fun isStandard(postPackage: PostPackage): Boolean {
        val boxSum = postPackage.length + postPackage.width + postPackage.height
        val boxSize = postPackage.length * postPackage.width * postPackage.height

        return postPackage.postType == PostType.PACKAGE
                && postPackage.weight <= maxWeight
                && boxSum <= maxSum && boxSize >= minSize
    }

}