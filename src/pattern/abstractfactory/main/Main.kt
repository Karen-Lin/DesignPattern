package pattern.abstractfactory.main

import pattern.abstractfactory.factory.TaiwanHamburgerStore
import pattern.abstractfactory.factory.USHamburgerStore


fun main(args: Array<String>) {

    println("============ Abstract factory pattern ============")
    /** Abstract factory pattern **/

    val taiwanBurgerStore = TaiwanHamburgerStore()
    taiwanBurgerStore.orderBeefHamburger()
    taiwanBurgerStore.orderChickenHamburger()

    val usBurgerStore = USHamburgerStore()
    usBurgerStore.orderBeefHamburger()
    usBurgerStore.orderChickenHamburger()


    println("============ Abstract factory pattern ============")

}