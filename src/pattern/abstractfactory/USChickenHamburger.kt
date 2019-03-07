package pattern.abstractfactory

class USChickenHamburger: Hamburger {

    override fun createBread(): String {
        return "全麥麵包"
    }

    override fun createMeat(): String {
        return "炸雞"
    }

    override fun createVegetable(): String {
        return "洋蔥"
    }

    override fun cooking(name: String) {
        println("在$name: {${createBread()} - ${createMeat()} - ${createVegetable()}}")
    }
}