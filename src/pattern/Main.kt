package pattern

import pattern.builder.People
import pattern.facade.Circle
import pattern.facade.Rectangle
import pattern.facade.Triangle
import pattern.factory.HamburgerFactory
import pattern.observer.BeefHamburgerSet

fun main(args: Array<String>) {

    println("Design pattern study group.")

    /** Builder pattern **/


    // TODO init people from PeopleBuilder
    val people = People.PeopleBuilder()

    /** Facade pattern **/

    // TODO use ShapeFacade to draw circle, rectangle and triangle
    val circle = Circle()
    val rectangle = Rectangle()
    val triangle = Triangle()

    circle.draw()
    rectangle.draw()
    triangle.draw()

    /** Observer pattern **/

    // TODO use interface 判斷餐點是否已經完成
    BeefHamburgerSet().apply {
        order()
    }

    /** Factory pattern **/

    // TODO 建立一個漢堡工廠生產 BeefHamburger & PorkHamburger
    HamburgerFactory().getBeefHamburger()
    HamburgerFactory().getPorkHamburger()
}