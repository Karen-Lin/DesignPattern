package pattern.visitor.data


abstract class Product(
    open var name: String = "",
    open var price: Int = 0
) {
    //TODO Design accept visitor abstract function
    abstract fun accept()
}