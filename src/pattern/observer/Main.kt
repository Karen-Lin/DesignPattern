package pattern.observer

fun main(args: Array<String>) {

    BeefHamburgerSet().apply {
        order(object : UserEvent {
            override fun finish() {
                println("拿到漢堡了 ya")
            }
        })
    }
}