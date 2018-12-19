package pattern.singleton.main

import pattern.singleton.LoginManager

fun main() {

    login()
    println("[狀態][自動登入] 是否登入？ ${LoginManager.getInstance().isLogin}")

}

private fun login() {
    if (!LoginManager.getInstance().isLogin) {
        LoginManager.getInstance().login()
    }
}