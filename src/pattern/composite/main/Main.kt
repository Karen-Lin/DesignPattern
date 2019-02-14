package pattern.composite.main

import pattern.composite.*


fun main(args: Array<String>) {

    println("============ Composite pattern ============")
    /** Composite pattern **/

    /**
     *
    - All Menu
    - Noodles Menu
    - Rice Menu
    - Drink Menu
        - [Black Coffee]
        - [Juice Milk]
        - [Coke]
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