package pattern.composite

class Menu(var name: String): Meal {

    var menu = ArrayList<Meal>()

    override fun add(meal: Meal) {
        menu.add(meal)
    }

    override fun remove(meal: Meal) {
        menu.remove(meal)
    }

    override fun display() {
        println("- $name ")
        menu.forEach {
            it.display()
        }
    }
}