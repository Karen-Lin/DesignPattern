package pattern.visitor.data


data class Fruit(override var name: String, override var price: Int) : Product(name, price) {
    //TODO Implement accept function

}