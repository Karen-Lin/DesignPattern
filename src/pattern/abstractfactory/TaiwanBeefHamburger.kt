package pattern.abstractfactory

class TaiwanBeefHamburger: Hamburger {

    override fun createBread(): String {
        return "滿意麵包"
    }

    override fun createMeat(): String {
        return "台灣牛"
    }

    override fun createVegetable(): String {
        return "生菜"
    }

    override fun cooking(name: String) {
        println("在$name: {${createBread()} - ${createMeat()} - ${createVegetable()}}")
    }
}