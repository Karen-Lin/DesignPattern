package pattern.observer

import java.util.*
import kotlin.concurrent.schedule

class BeefHamburgerSet {

    var listener: UserEvent? = null

    fun order() {
        println("BeefHamburgerSet::order")
        Timer().schedule(300) {
            // TODO 監聽是否已經完成
        }
    }

}