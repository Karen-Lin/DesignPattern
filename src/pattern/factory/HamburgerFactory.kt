package pattern.factory

class HamburgerFactory {
    fun getBeefHamburger(): Hamburger {
        return BeefHamburger()
    }

    fun getPorkHamburger(): Hamburger {
        return PorkHamburger()
    }
}