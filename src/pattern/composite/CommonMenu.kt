package pattern.composite

class CommonMenu(var name: String) {

    private var menu = ArrayList<CommonMenu>()

    private var coffeeDrink = ArrayList<CoffeeDrink>()
    private var beefNoodles = ArrayList<BeefNoodles>()
    private var chickenRice = ArrayList<ChickenRice>()

    fun addMenu(menu: CommonMenu) {
        this.menu.add(menu)
    }

    fun addBeefNoodles(meal: BeefNoodles) {
        beefNoodles.add(meal)
    }
    fun addChickenRice(meal: ChickenRice) {
        chickenRice.add(meal)
    }
    fun addCoffeeDrink(meal: CoffeeDrink) {
        coffeeDrink.add(meal)
    }

    fun display() {
        menu.forEach {
            println("- $it")
            if (it.coffeeDrink.size > 0) println("   - ${it.coffeeDrink}")
            if (it.beefNoodles.size > 0) println("   - ${it.beefNoodles}")
            if (it.chickenRice.size > 0) println("   - ${it.chickenRice}")
        }
    }

    override fun toString(): String {
        return name
    }
}