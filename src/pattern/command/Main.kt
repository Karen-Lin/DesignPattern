package pattern.command

import pattern.command.animal.Fish
import pattern.command.animal.Human
import pattern.command.animal.Rabbit
import pattern.command.animal.SuperMan


fun main(args: Array<String>) {

    println("兔子和人類跳")
    JumpCommand(Rabbit()).move()
    JumpCommand(Human()).move()

    println("魚和超人游泳")
    SwimCommand(Fish()).move()
    SwimCommand(SuperMan()).move()

    println("人和超人走路")
    WalkCommand(Human()).move()
    WalkCommand(SuperMan()).move()

    println("超人飛吧跳吧")
    FlyCommand(SuperMan()).move()
    JumpCommand(SuperMan()).move()

    println("一起前進吧")
    MircoCommand().move()
}