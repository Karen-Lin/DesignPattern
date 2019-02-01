package pattern.chainofresponsibility.handler

import pattern.chainofresponsibility.request.LeaveRequest

interface LeaveHandler {

    fun handleRequest(leaveRequest: LeaveRequest)

}