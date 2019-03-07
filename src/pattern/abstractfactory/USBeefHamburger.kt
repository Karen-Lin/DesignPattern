package pattern.abstractfactory

class USBeefHamburger: Hamburger {

    override fun createBread(): String {
        return "全麥麵包"
    }

    override fun createMeat(): String {
        return "美國牛"
    }

    override fun createVegetable(): String {
        return "生菜"
    }

    override fun cooking(name: String) {
        println("在$name: {${createBread()} - ${createMeat()} - ${createVegetable()}}")
    }
}