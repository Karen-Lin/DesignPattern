package pattern.strategy.main

import pattern.strategy.SaleFactory


fun main(args: Array<String>) {

    println("============ Strategy pattern ============.")
    /** Strategy pattern **/

    SaleFactory().getChristmasSalePlan().also {
        println("聖誕節折扣優惠為：${it.getDiscount()}")
    }

    println("============ Strategy pattern ============.")

}