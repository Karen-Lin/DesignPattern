package pattern.memento.main

import pattern.memento.Game
import pattern.memento.Player

fun main(args: Array<String>) {

    val maxCount = 10
    var currentCount = 0
    val player = Player("Amin")
    val game = Game()

    while (currentCount < maxCount) {
        player.money += game.go()
        println("${player.name}[$currentCount]: ${player.money}")

        if (player.money <= 0) {
            currentCount = maxCount
        } else {
            currentCount++
        }
    }

    /**
     *  大樂透遊戲
     *  如果開獎結果 < 5 就輸了 -$20
     *  如果開獎結果 >= 5 就贏了 +$10
     *  總共可以玩 10 次 ， 如果沒有錢就結束遊戲
     *  想要完整的玩 10 次
     */
}