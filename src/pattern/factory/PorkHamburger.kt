package pattern.factory

class PorkHamburger : Hamburger {
    override val bread: String
        get() = "全麥麵包"
    override val meat: String
        get() = "豬肉"
    override val vegetables: String
        get() = "洋蔥滿滿"

    override fun print() {
        println("PorkHamburger bread: $bread, meat: $meat, vegetables: $vegetables")
    }
}