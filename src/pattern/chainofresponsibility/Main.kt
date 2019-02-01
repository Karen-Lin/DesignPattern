package pattern.chainofresponsibility

import pattern.chainofresponsibility.request.LeaveRequest

fun main(args: Array<String>) {

    val chiaen = LeaveRequest("佳恩", "感冒看醫生", 1)
    handleLeaveRequest(chiaen)

    val karen = LeaveRequest("凱倫", "出國去日本玩", 5)
    handleLeaveRequest(karen)

    val claire = LeaveRequest("克萊爾", "產假", 90)
    handleLeaveRequest(claire)

    val amin = LeaveRequest("阿敏", "心情不美麗", 180)
    handleLeaveRequest(amin)


}

private fun handleLeaveRequest(leaveRequest: LeaveRequest) {
    when {
        leaveRequest.day <= 3 -> println("小組長: 批准${leaveRequest.name}的${leaveRequest.day}天假")
        leaveRequest.day <= 7 -> println("漢克: 批准${leaveRequest.name}的${leaveRequest.day}天假")
        leaveRequest.day <= 90 -> println("愛德: 批准${leaveRequest.name}的${leaveRequest.day}天假")
        else -> println("${leaveRequest.name}假單不被批准")
    }
}