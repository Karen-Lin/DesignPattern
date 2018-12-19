package pattern.singleton

class LoginManager {

    var isLogin: Boolean = false

    companion object {
        //TODO
    }

    fun login() {
        this.isLogin = true
    }

}