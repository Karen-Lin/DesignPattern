package pattern.abstractfactory.factory

import pattern.abstractfactory.BeefHamburger
import pattern.abstractfactory.ChickenHamburger
import pattern.abstractfactory.Hamburger
import pattern.abstractfactory.TaiwanIngredientFactory

class TaiwanHamburgerStore: HamburgerStore {

    override fun getName(): String {
        return "台灣漢堡店"
    }

    override fun createBeefHamburger(): Hamburger {
        return BeefHamburger(TaiwanIngredientFactory())
    }

    override fun createChickenHamburger(): Hamburger {
        return ChickenHamburger(TaiwanIngredientFactory())
    }

}
