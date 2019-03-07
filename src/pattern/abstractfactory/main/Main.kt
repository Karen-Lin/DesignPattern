package pattern.abstractfactory.main

import pattern.abstractfactory.SimpleHamburgerStore


fun main(args: Array<String>) {

    println("============ Abstract factory pattern ============")
    /** Abstract factory pattern **/


    val hamburgerStore = SimpleHamburgerStore()
    hamburgerStore.createHamburger("USStore", "BeefHamburger")
    hamburgerStore.createHamburger("TaiwanStore", "ChickenHamburger")


    println("============ Abstract factory pattern ============")

}