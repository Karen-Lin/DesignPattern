package pattern.facade

class ShapeFacade {

    private val circle = Circle()
    private val rectangle = Rectangle()
    private val triangle = Triangle()

    fun draw() {
        circle.draw()
        rectangle.draw()
        triangle.draw()
    }
}
