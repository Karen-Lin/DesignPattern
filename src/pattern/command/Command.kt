package pattern.command

import pattern.command.animal.*

interface Command {
    fun move()
}

class JumpCommand(private val receiver: Receiver): Command {
    override fun move() = println("${receiver.name} jumping ^")

}

class SwimCommand(private val receiver: Receiver): Command  {
    override fun move() = println("${receiver.name} swimming ~")
}

class WalkCommand(private val receiver: Receiver): Command  {
    override fun move() = println("${receiver.name} walking -")
}

class FlyCommand(private val receiver: Receiver): Command  {
    override fun move() {
        println("${receiver.name} flying -===")
    }
}

class MircoCommand: Command {

    var array = arrayOf(Fish(), Human(), Rabbit(), SuperMan())

    override fun move() {
        array.forEach {
            println("${it.name} walking -===")
        }
    }

}
