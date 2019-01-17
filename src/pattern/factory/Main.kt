package pattern.factory

fun main(args: Array<String>) {

    // TODO 建立一個漢堡工廠生產 BeefHamburger & PorkHamburger
    HamburgerFactory().getBeefHamburger()
    HamburgerFactory().getPorkHamburger()
}