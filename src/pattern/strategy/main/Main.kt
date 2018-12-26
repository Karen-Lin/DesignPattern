package pattern.strategy.main

import pattern.strategy.DepartmentStore
import pattern.strategy.SaleFactory


fun main(args: Array<String>) {

    println("============ Strategy pattern ============.")
    /** Strategy pattern **/

    DepartmentStore("SpecialOfferSale").also {
        println("聖誕節折扣優惠為：${it.getSaleDiscount()}")
    }
    DepartmentStore("RebateSale").also {
        println("週年慶折扣優惠為：${it.getSaleDiscount()}")
    }
    DepartmentStore("DiscountSale").also {
        println("平日會員折扣優惠為：${it.getSaleDiscount()}")
    }

    println("============ Strategy pattern ============.")

}