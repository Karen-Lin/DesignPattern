package pattern

import pattern.builder.People
import pattern.facade.Circle
import pattern.facade.Rectangle
import pattern.facade.Triangle
import pattern.factory.Hamburger
import pattern.observer.BeefHamburgerSet
import java.util.*
import kotlin.concurrent.schedule

fun main(args: Array<String>) {

    println("Design pattern study group.")

    /** Builder pattern **/
    val people = People("Karen", "Lin", "Taiwan Top Model", "Taipei Neihu", "0988333333")

    /** Facade pattern **/
    val circle = Circle()
    val rectangle = Rectangle()
    val triangle = Triangle()

    circle.draw()
    rectangle.draw()
    triangle.draw()

    /** Observer pattern **/
    BeefHamburgerSet().apply {
        order()
        do {
            println("Wait ...")
        } while (!isFinish)
    }
    // 點好餐之後，不知道餐點做好了沒？沒人通知我

    /** Factory pattern **/
    val beefHamburger = Hamburger("白麵包", "牛肉", "生菜")
    beefHamburger.cooking()
    val porkHamburger = Hamburger("全麥麵包", "豬肉", "洋蔥")
    porkHamburger.cooking()
    // 很容易做錯放錯材料，得到結果和預期可能會不一樣
}