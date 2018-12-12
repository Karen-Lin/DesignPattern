package pattern.observer

import java.util.*
import kotlin.concurrent.schedule

class BeefHamburgerSet {

    var isFinish = false

    fun order() {
        println("BeefHamburgerSet::order")
        Timer().schedule(300) {
            println("BeefHamburgerSet::Cooking OK")
            isFinish = true
        }
    }
}