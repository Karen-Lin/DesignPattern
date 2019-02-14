package pattern.composite

class Drink(var name: String): Meal {

    override fun add(meal: Meal) {
    }

    override fun remove(meal: Meal) {
    }

    override fun display() {
        println("   - $name ")
    }
}