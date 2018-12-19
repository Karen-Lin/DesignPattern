package pattern.decorator

class TapiocaPearl(private val ingredient: Ingredient) : Ingredient {

    override fun getContent(): String {
        return ingredient.getContent() + "加珍珠"
    }

    override fun cost(): Int {
        return ingredient.cost() + 5
    }

}