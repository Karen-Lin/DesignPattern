package pattern.chainofresponsibility

import pattern.chainofresponsibility.`object`.*
import pattern.chainofresponsibility.enums.PostType

fun main(args: Array<String>) {

    // 處理明信片
    handlePostObject(PostCard())

    // 處理信件
    handlePostObject(Mail())

    // 處理包裹
    handlePostObject(Box())

    // 處理米粒
    handlePostObject(Rice())


}

private fun handlePostObject(postPackage: PostPackage) {
    val size = postPackage.length * postPackage.width * postPackage.height
    when(postPackage.postType) {
        PostType.POST_CARD -> {
            val maxWeight = 0.18F //kg
            val maxSize: Float = 14.8F * 10.5F * 1 //cm
            val minSize: Float = 14F * 9F * 0.1F //cm
            if (postPackage.weight <= maxWeight && (size > minSize && size <= maxSize)) {
                println("明信片分類給郵差")
            } else {
                println("規格不符，退回")
            }
        }
        PostType.MAIL -> {
            val maxWeight = 2F //kg
            val maxSize: Float = 60F * 60 * 60 //cm
            val minSize: Float = 14F * 9F * 0.1F //cm
            if (postPackage.weight <= maxWeight && (size > minSize && size <= maxSize)) {
                println("信件分類給郵差")
            } else {
                println("規格不符，退回")
            }
        }
        PostType.PACKAGE -> {
            val maxWeight: Float = 20F //kg
            val maxSum: Float = 150F //長+寬+高的總和 cm
            val minSize: Float = 14F * 9F * 0.1F //cm
            val boxSum = postPackage.length + postPackage.width + postPackage.height
            if (postPackage.weight <= maxWeight && boxSum <= maxSum && size >= minSize) {
                println("包裹分類給郵車")
            } else {
                println("規格不符，退回")
            }
        }
    }
}