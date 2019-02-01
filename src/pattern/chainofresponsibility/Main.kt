package pattern.chainofresponsibility

import pattern.chainofresponsibility.handler.*
import pattern.chainofresponsibility.request.LeaveRequest

fun main(args: Array<String>) {

    //TODO 做出一個處理假單鏈


    val chiaen = LeaveRequest("佳恩", "感冒看醫生", 1)
    //TODO 處理佳恩的假單

    val karen = LeaveRequest("凱倫", "出國去日本玩", 5)
    //TODO 處理凱倫的假單

    val claire = LeaveRequest("克萊爾", "產假", 90)
    //TODO 處理克萊爾的假單

    val amin = LeaveRequest("阿敏", "心情不美麗", 180)
    //TODO 處理阿敏的假單


}