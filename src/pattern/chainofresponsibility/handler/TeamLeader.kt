package pattern.chainofresponsibility.handler

import pattern.chainofresponsibility.request.LeaveRequest

class TeamLeader(private val handler: LeaveHandler?) : LeaveHandler {
    
    override fun handleRequest(leaveRequest: LeaveRequest) {
        if (leaveRequest.day <= 3) {
            println("小組長: 批准${leaveRequest.name}的${leaveRequest.day}天假")
        } else {
            handler?.handleRequest(leaveRequest) ?: println("假單不被批准")
        }
    }
    
}