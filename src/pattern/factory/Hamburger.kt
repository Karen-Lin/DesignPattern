package pattern.factory

class Hamburger(
    private val bread: String,
    private val meat: String,
    private val vegetables: String
) {

    fun cooking() {
        println("Hamburger bread: $bread, meat: $meat, vegetables: $vegetables")
    }
}