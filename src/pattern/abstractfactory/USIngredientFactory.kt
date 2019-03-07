package pattern.abstractfactory

class USIngredientFactory: IngredientFactory {

    override fun createBread(): String {
        return "全麥麵包"
    }

    override fun createBeef(): String {
        return "美國牛"
    }

    override fun createChicken(): String {
        return "炸雞肉"
    }

    override fun createSeafood(): String {
        return "蛤蜊+鮮蝦"
    }

    override fun createVegetables(): String {
        return "生菜+番茄"
    }

    override fun createSauce(): String {
        return "黃芥末醬"
    }

    override fun createCheese(): String {
        return "帕馬森起司"
    }
}