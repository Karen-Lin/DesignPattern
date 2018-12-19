package pattern.decorator

class Flan(private val ingredient: Ingredient) : Ingredient {

    override fun getContent(): String {
        return ingredient.getContent() + "加布丁"
    }

    override fun cost(): Int {
        return ingredient.cost() + 10
    }

}