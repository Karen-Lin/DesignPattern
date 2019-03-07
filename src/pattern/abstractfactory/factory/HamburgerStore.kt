package pattern.abstractfactory.factory

import pattern.abstractfactory.Hamburger


interface HamburgerStore {

    fun orderBeefHamburger() {
        createBeefHamburger().cooking(getName())
    }

    fun orderChickenHamburger() {
        createChickenHamburger().cooking(getName())
    }

    fun getName(): String

    fun createBeefHamburger(): Hamburger
    fun createChickenHamburger(): Hamburger
}