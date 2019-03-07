package pattern.abstractfactory.factory

import pattern.abstractfactory.BeefHamburger
import pattern.abstractfactory.ChickenHamburger
import pattern.abstractfactory.Hamburger
import pattern.abstractfactory.USIngredientFactory

class USHamburgerStore: HamburgerStore {

    override fun getName(): String {
        return "美國漢堡店"
    }

    override fun createBeefHamburger(): Hamburger {
        return BeefHamburger(USIngredientFactory())
    }

    override fun createChickenHamburger(): Hamburger {
        return ChickenHamburger(USIngredientFactory())
    }
}