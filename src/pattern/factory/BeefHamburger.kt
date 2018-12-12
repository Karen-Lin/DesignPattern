package pattern.factory

class BeefHamburger : Hamburger {
    override val bread: String
        get() = "白麵包"
    override val meat: String
        get() = "牛肉"
    override val vegetables: String
        get() = "很多生菜"

    override fun print() {
        println("BeefHamburger bread: $bread, meat: $meat, vegetables: $vegetables")
    }
}