package pattern.facade

fun main(args: Array<String>) {

    val circle = Circle()
    val rectangle = Rectangle()
    val triangle = Triangle()

    circle.draw()
    rectangle.draw()
    triangle.draw()
}