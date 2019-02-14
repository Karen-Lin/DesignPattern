package pattern.composite.main

import pattern.composite.*


fun main(args: Array<String>) {

    println("============ Composite pattern ============")
    /** Composite pattern **/

    /**
     *
    - All Menu
    - Noodles Menu
        - [Beef Noodles]
    - Rice Menu
        - [Chicken Rice]
    - Drink Menu
        - [Black Coffee]
     **/

    val menu = CommonMenu("All Menu")
    val noodlesMenu = CommonMenu("Noodles Menu")
    val riceMenu = CommonMenu("Rice Menu")
    val drinkMenu = CommonMenu("Drink Menu")

    noodlesMenu.addBeefNoodles(BeefNoodles("Beef Noodles"))
    riceMenu.addChickenRice(ChickenRice("Chicken Rice"))
    drinkMenu.addCoffeeDrink(CoffeeDrink("Black Coffee"))

    menu.addMenu(menu)
    menu.addMenu(noodlesMenu)
    menu.addMenu(riceMenu)
    menu.addMenu(drinkMenu)

    menu.display()

    println("============ Composite pattern ============")

}