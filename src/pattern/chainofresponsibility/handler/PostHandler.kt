package pattern.chainofresponsibility.handler

import pattern.chainofresponsibility.`object`.PostPackage

interface PostHandler {

    fun handlePackage(postPackage: PostPackage)

}