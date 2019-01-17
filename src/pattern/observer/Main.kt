package pattern.observer

fun main(args: Array<String>) {

    /** Observer pattern **/
    BeefHamburgerSet().apply {
        order()
        do {
            println("Wait ...")
        } while (!isFinish)
    }
    // 點好餐之後，不知道餐點做好了沒？沒人通知我
}