package pattern.visitor.data

import pattern.visitor.ProductVisitor


data class Book(override var name: String, override var price: Int) : Product(name, price) {
    override fun accept(productVisitor: ProductVisitor) {
        productVisitor.visit(this)
    }
}