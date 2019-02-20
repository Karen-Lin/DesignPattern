package pattern.memento

import java.util.*

class Game {

    private val random = Random()

    fun go(): Int {
        return if (random.nextInt(10) < 5) {
            -20
        } else {
            10
        }
    }
}