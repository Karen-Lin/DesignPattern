package pattern.memento

import java.util.*

class Game(private var player: Player) {

    private val random = Random()
    fun go() {
        if (random.nextInt(10) < 5) {
            player.money -= 30
        } else {
            player.money += 5
        }
    }
}