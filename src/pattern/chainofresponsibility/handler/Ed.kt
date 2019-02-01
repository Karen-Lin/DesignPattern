package pattern.chainofresponsibility.handler

import pattern.chainofresponsibility.request.LeaveRequest

class Ed(private val handler: LeaveHandler?): LeaveHandler {

    override fun handleRequest(leaveRequest: LeaveRequest) {
        if (leaveRequest.day <= 90) {
            println("愛德: 批准${leaveRequest.name}的${leaveRequest.day}天假")
        } else {
            handler?.handleRequest(leaveRequest) ?: println("${leaveRequest.name}假單不被批准")
        }
    }

}