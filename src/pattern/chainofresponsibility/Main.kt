package pattern.chainofresponsibility

import pattern.chainofresponsibility.handler.*
import pattern.chainofresponsibility.request.LeaveRequest

fun main(args: Array<String>) {

    val leaveHandler = TeamLeader(Hank(Ed(null)))

    val chiaen = LeaveRequest("佳恩", "感冒看醫生", 1)
    leaveHandler.handleRequest(chiaen)

    val karen = LeaveRequest("凱倫", "出國去日本玩", 5)
    leaveHandler.handleRequest(karen)

    val claire = LeaveRequest("克萊爾", "產假", 90)
    leaveHandler.handleRequest(claire)

    val amin = LeaveRequest("阿敏", "心情不美麗", 180)
    leaveHandler.handleRequest(amin)


}