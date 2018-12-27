package pattern.adapter.main

import pattern.adapter.Cash
import pattern.adapter.CoffeeShop


fun main(args: Array<String>) {

    println("============ Adapter pattern ============.")
    /** Adapter pattern **/

    CoffeeShop().buyCoffee(Cash())

    //TODO Implement proper Badge class to buy a cup of coffee smoothly
    //TODO Print "付款方式：公司員工帳戶付款""

    
    println("============ Adapter pattern ============.")

}