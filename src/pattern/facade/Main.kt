package pattern.facade

fun main(args: Array<String>) {

    // TODO use ShapeFacade to draw circle, rectangle and triangle
    val circle = Circle()
    val rectangle = Rectangle()
    val triangle = Triangle()

    circle.draw()
    rectangle.draw()
    triangle.draw()
}