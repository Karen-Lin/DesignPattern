package pattern.visitor.data


data class Fruit(override var name: String, override var price: Int) : Product(name, price) {
    override fun accept() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    //TODO Implement accept function

}