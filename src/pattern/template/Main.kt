package pattern.template

import pattern.template.machine.AmericanoMachine
import pattern.template.machine.LatteCoffeeMachine

fun main(args: Array<String>) {

    println("客人點了拿鐵：")
    LatteCoffeeMachine().start()

    println("\n客人點了美式咖啡：")
    AmericanoMachine().start()

}