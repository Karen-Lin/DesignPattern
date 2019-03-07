package pattern.abstractfactory

class ChickenHamburger(var ingredientFactory: IngredientFactory): Hamburger {

    override fun cooking(name: String) {
        println("在${name}點了一份${toString()}: {${ingredientFactory.createBread()} - ${ingredientFactory.createChicken()} - " +
                "${ingredientFactory.createVegetables()} - ${ingredientFactory.createSauce()}}")
    }

    override fun toString(): String {
        return "雞肉漢堡"
    }
}