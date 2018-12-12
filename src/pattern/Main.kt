package pattern

import pattern.builder.People
import pattern.facade.ShapeFacade
import pattern.factory.HamburgerFactory
import pattern.observer.BeefHamburgerSet
import pattern.observer.UserEvent

fun main(args: Array<String>) {

    println("Design pattern study group.")

    /** Builder pattern **/
    val people: People =
        People.PeopleBuilder("Karen", "Lin")
            .nickName("Taiwan Top Model")
            .address("Taipei Neihu")
            .phone("0988333333")
            .build()

    /** Facade pattern **/
    val shapeFacade = ShapeFacade()
    shapeFacade.draw()

    /** Observer pattern **/
    BeefHamburgerSet().apply {
        order(object : UserEvent {
            override fun finish() {
                println("拿到漢堡了 ya")
            }
        })
    }

    /** Factory pattern **/
    HamburgerFactory().getBeefHamburger().also {
        it.print()
    }
    HamburgerFactory().getPorkHamburger().print()
}