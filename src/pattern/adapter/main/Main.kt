package pattern.adapter.main

import pattern.adapter.*


fun main(args: Array<String>) {

    println("============ Adapter pattern ============.")
    /** Adapter pattern **/

    CoffeeShop().buyCoffee(Cash())
    CoffeeShop().buyCoffee(Badge())

    println("============ Adapter pattern ============.")

}