package pattern.abstractfactory

class TaiwanChickenHamburger: Hamburger {

    override fun createBread(): String {
        return "滿意麵包"
    }

    override fun createMeat(): String {
        return "無骨雞肉"
    }

    override fun createVegetable(): String {
        return "生菜+洋蔥"
    }

    override fun cooking(name: String) {
        println("在$name: {${createBread()} - ${createMeat()} - ${createVegetable()}}")
    }
}