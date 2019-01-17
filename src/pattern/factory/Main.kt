package pattern.factory

fun main(args: Array<String>) {

    HamburgerFactory().getBeefHamburger().also {
        it.print()
    }
    HamburgerFactory().getPorkHamburger().print()
}