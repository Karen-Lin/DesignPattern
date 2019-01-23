package pattern.command

import pattern.command.animal.Fish
import pattern.command.animal.Human
import pattern.command.animal.Rabbit
import pattern.command.animal.SuperMan

fun main(args: Array<String>) {

    println("兔子和人類跳")
    val rabbitJumpCommand = JumpCommand(Rabbit())
    rabbitJumpCommand.move()
    val humanJumpCommand = JumpCommand(Human())
    humanJumpCommand.move()

    println("魚和超人游泳")
    val fishSwimCommand = SwimCommand(Fish())
    fishSwimCommand.move()
    SwimCommand(SuperMan()).move()

    println("人和超人走路")
    val humanWalkCommand = WalkCommand(Human())
    humanWalkCommand.move()
    WalkCommand(SuperMan()).move()

    println("超人飛吧跳吧")
    val superMan = SuperMan()
    val superManFlyCommand = FlyCommand(superMan)
    superManFlyCommand.move()
    JumpCommand(superMan).move()

    println("兔子跳完人類跳")
    val commandList = ArrayList<Command>()
    commandList.add(rabbitJumpCommand)
    commandList.add(humanJumpCommand)
    commandList.forEach { it.move() }

    println("一起前進吧")
    MircoCommand().apply {
        addCommand(rabbitJumpCommand)
        addCommand(fishSwimCommand)
        addCommand(humanWalkCommand)
        addCommand(superManFlyCommand)
        move()
    }
}