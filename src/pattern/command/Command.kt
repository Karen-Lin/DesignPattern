package pattern.command

import pattern.command.animal.Receiver

interface Command {
    fun move()
}

class JumpCommand(private val receiver: Receiver) : Command {
    override fun move() = println("${receiver.name} jumping ^")
}

class SwimCommand(private val receiver: Receiver) : Command {
    override fun move() = println("${receiver.name} swimming ~")
}

class WalkCommand(private val receiver: Receiver) : Command {
    override fun move() = println("${receiver.name} walking -")
}

class FlyCommand(private val receiver: Receiver) : Command {
    override fun move() = println("${receiver.name} flying -===")
}

class MircoCommand : Command {

    private val commandList = ArrayList<Command>()

    fun addCommand(command: Command) {
        commandList.add(command)
    }

    override fun move() {
        commandList.forEach { it.move() }
    }
}
