package pattern.proxy.main

import pattern.proxy.User


fun main(args: Array<String>) {

    println("============ Proxy pattern ============")
    /** Proxy pattern **/

    val user = User()
    user.doHouseWork()


    println("============ Proxy pattern ============")

}