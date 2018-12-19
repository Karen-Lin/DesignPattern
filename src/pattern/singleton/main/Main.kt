package pattern.singleton.main

import pattern.singleton.LoginManager

fun main() {

    login()
    println("[狀態] 是否登入？ ${LoginManager().isLogin}")

}

private fun login() {
    val loginManager = LoginManager()
    if (!LoginManager().isLogin) {
        loginManager.login()
        println("[狀態][自動登入] 是否登入？ ${loginManager.isLogin}")
    }
}