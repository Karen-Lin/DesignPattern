package pattern.composite

class CommonMenu(var name: String) {

    private var menu = ArrayList<CommonMenu>()

    private var coffeeDrink = ArrayList<CoffeeDrink>()
    private var milkDrink = ArrayList<BeefNoodles>()
    private var sodaDrink = ArrayList<ChickenRice>()

    fun addMenu(menu: CommonMenu) {
        this.menu.add(menu)
    }

    fun addBeefNoodles(drink: BeefNoodles) {
        milkDrink.add(drink)
    }
    fun addChickenRice(drink: ChickenRice) {
        sodaDrink.add(drink)
    }
    fun addCoffeeDrink(drink: CoffeeDrink) {
        coffeeDrink.add(drink)
    }

    fun display() {
        menu.forEach {
            println("- ${it}")
            if (it.coffeeDrink.size > 0) println("   - ${it.coffeeDrink}")
            if (it.milkDrink.size > 0) println("   - ${it.milkDrink}")
            if (it.sodaDrink.size > 0) println("   - ${it.sodaDrink}")
        }
    }

    override fun toString(): String {
        return name
    }
}