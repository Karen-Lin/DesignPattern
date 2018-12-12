package pattern.observer

import java.util.*
import kotlin.concurrent.schedule

class BeefHamburgerSet {

    var listener: UserEvent? = null

    fun order(listener: UserEvent) {
        this.listener = listener
        println("BeefHamburgerSet::order")
        Timer().schedule(300) {
            this@BeefHamburgerSet.listener?.finish()
        }
    }

}