package pattern.memento.main

import pattern.memento.Caretaker
import pattern.memento.Game
import pattern.memento.Originator
import pattern.memento.Player

fun main(args: Array<String>) {

    val maxCount = 10
    var currentCount = 0
    var player = Player("Amin")
    val game = Game()

    /**
     *  步驟
     *  建立 Originator 類別，儲存目前狀態、產生紀錄、復原
     *  建立 Caretaker 類別，儲存紀錄和讀取紀錄
     *
     *  Main
     *  創建新紀錄
     *  如果大樂透開出來的獎金比記錄的多就儲存記錄
     *  如果沒錢了就讀取紀錄
     */

    val originator = Originator(player.name)
    val caretaker = Caretaker()
    originator.set(player.money)
    caretaker.add(originator.saveToMemento())

    while (currentCount < maxCount) {
        player.money += game.go()
        println("${player.name}[$currentCount]: ${player.money}")

        if (player.money > originator.money) {
            originator.set(player.money)
            caretaker.set(originator.saveToMemento())
        }

        if (player.money <= 0) {
            player = caretaker.undo()
            originator.restoreFromMemento(player)
        }

        currentCount++
    }
}