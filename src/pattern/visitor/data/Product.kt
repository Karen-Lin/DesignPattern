package pattern.visitor.data

import pattern.visitor.ProductVisitor

abstract class Product(
    open var name: String = "",
    open var price: Int = 0
) {
    abstract fun accept(productVisitor: ProductVisitor)
}