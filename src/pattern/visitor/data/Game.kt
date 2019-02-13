package pattern.visitor.data

data class Game(override var name: String, override var price: Int) : Product(name, price)