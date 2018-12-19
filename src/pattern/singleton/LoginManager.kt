package pattern.singleton

class LoginManager {

    var isLogin: Boolean = false

    companion object {
        private var INSTANCE: LoginManager? = null

        fun getInstance(): LoginManager {
            return INSTANCE ?: LoginManager().apply {
                INSTANCE = this
            }
        }
    }

    fun login() {
        this.isLogin = true
    }

}