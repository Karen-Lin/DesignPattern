package pattern

import pattern.builder.People
import pattern.facade.Circle
import pattern.facade.Rectangle
import pattern.facade.Triangle

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
}