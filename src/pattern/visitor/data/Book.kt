package pattern.visitor.data


data class Book(override var name: String, override var price: Int) : Product(name, price)