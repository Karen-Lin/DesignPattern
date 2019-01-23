package pattern.command

import pattern.command.animal.Fish
import pattern.command.animal.Human
import pattern.command.animal.Rabbit
import pattern.command.animal.SuperMan

fun main(args: Array<String>) {

    Rabbit().move()
    Fish().move()

    Human().apply {
        move()
        moveBySwim()
    }

    SuperMan().apply {
        move()
        changeMove()
    }

    /*
     *  Bad
     *  如果人類也可以跳著移動或者超人也可以在水裡自由移動，那就要在各別的物件裡再加上游泳或跳得動作，
     *  相同的動作就會重複出現在不同物件裡。
     */
}