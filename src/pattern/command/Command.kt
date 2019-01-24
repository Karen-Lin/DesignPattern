package pattern.command

import pattern.command.animal.Receiver

interface Command {
    fun move()
}

class JumpCommand(private val receiver: Receiver) {
    // println("${receiver.name} jumping ^")
}

class SwimCommand(private val receiver: Receiver) {
    // println("${receiver.name} swimming ~")
}

class WalkCommand(private val receiver: Receiver) {
    // println("${receiver.name} walking -")
}

class FlyCommand(private val receiver: Receiver) {
    // println("${receiver.name} flying -===")
}

class MircoCommand {
}
