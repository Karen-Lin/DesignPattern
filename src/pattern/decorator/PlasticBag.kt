package pattern.decorator

class PlasticBag(private val drink: Drink) : Ingredient {

    override fun getContent(): String {
        return drink.getContent() + "裝提袋"
    }

    override fun cost(): Int {
        return drink.cost() + 1
    }

}