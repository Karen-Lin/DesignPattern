package pattern.chainofresponsibility

import pattern.chainofresponsibility.`object`.Box
import pattern.chainofresponsibility.`object`.Mail
import pattern.chainofresponsibility.`object`.PostCard
import pattern.chainofresponsibility.`object`.Rice
import pattern.chainofresponsibility.handler.MailHandler
import pattern.chainofresponsibility.handler.PackageHandler
import pattern.chainofresponsibility.handler.PostCardHandler

fun main(args: Array<String>) {

    val postHandler = PackageHandler(PostCardHandler(MailHandler(null)))

    // 處理明信片
    postHandler.handlePackage(PostCard())

    // 處理信件
    postHandler.handlePackage(Mail())

    // 處理包裹
    postHandler.handlePackage(Box())

    // 處理米粒
    postHandler.handlePackage(Rice())

}