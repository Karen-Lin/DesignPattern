package pattern.abstractfactory

class TaiwanIngredientFactory: IngredientFactory {

    override fun createBread(): String {
        return "滿意麵包"
    }

    override fun createBeef(): String {
        return "台灣牛"
    }

    override fun createChicken(): String {
        return "無骨雞肉"
    }

    override fun createSeafood(): String {
        return "鮮蝦+花枝"
    }

    override fun createVegetables(): String {
        return "切絲洋蔥+酸黃瓜"
    }

    override fun createSauce(): String {
        return "番茄醬"
    }

    override fun createCheese(): String {
        return "莫札瑞拉起司"
    }
}