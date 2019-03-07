package pattern.abstractfactory

class BeefHamburger(var ingredientFactory: IngredientFactory): Hamburger {

    override fun cooking(name: String) {
        println("在${name}點了一份${toString()}: {${ingredientFactory.createBread()} - ${ingredientFactory.createBeef()} - " +
                "${ingredientFactory.createVegetables()} - ${ingredientFactory.createSauce()} - " +
                "${ingredientFactory.createCheese()}}")
    }

    override fun toString(): String {
        return "牛肉漢堡"
    }
}