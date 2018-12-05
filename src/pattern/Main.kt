package pattern

import pattern.builder.People
import pattern.facade.Circle
import pattern.facade.Rectangle
import pattern.facade.Triangle

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

}