package pattern.composite.main

import pattern.composite.Drink
import pattern.composite.Menu
import pattern.composite.Noodles
import pattern.composite.Rice


fun main(args: Array<String>) {

    println("============ Composite pattern ============")
    /** Composite pattern **/

    /**
     *
    - All Menu
    - Noodles Menu
        - Beef Noodles
    - Rice Menu
        - Chicken Rice
    - Meal Menu
        - Latte
        - Apple Juice
        - Coke
     **/

    val allMenu = Menu("All Menu")

    val noodlesMenu = Menu("Noodle Menu")
    val riceMenu = Menu("Rice Menu")
    val drinkMenu = Menu("Drink Menu")

    noodlesMenu.add(Noodles("Beef Noodles"))
    riceMenu.add(Rice("Chicken Rice"))
    drinkMenu.add(Drink("Latte"))
    drinkMenu.add(Drink("Apple Juice"))
    drinkMenu.add(Drink("Coke"))

    allMenu.add(noodlesMenu)
    allMenu.add(riceMenu)
    allMenu.add(drinkMenu)

    allMenu.display()

    println("============ Composite pattern ============")

}