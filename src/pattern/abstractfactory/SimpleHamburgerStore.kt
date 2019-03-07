package pattern.abstractfactory

class SimpleHamburgerStore {

    private var hamburger: Hamburger? = null

    fun createHamburger(style: String, type: String) {
        if (style == "TaiwanStore") {
            if (type == "BeefHamburger") {
                hamburger = TaiwanBeefHamburger()
            } else if (type == "ChickenHamburger") {
                hamburger = TaiwanChickenHamburger()
            }
        } else if (style == "USStore") {
            if (type == "BeefHamburger") {
                hamburger = USBeefHamburger()
            } else if (type == "ChickenHamburger") {
                hamburger = USChickenHamburger()
            }
        }

        hamburger?.cooking("${style}點了一份$type")
    }

}