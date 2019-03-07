package pattern.abstractfactory

interface IngredientFactory {

    fun createBread(): String
    fun createBeef(): String
    fun createChicken(): String
    fun createSeafood(): String
    fun createVegetables(): String
    fun createSauce(): String
    fun createCheese(): String
}