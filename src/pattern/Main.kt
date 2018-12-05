package pattern

import pattern.builder.People
import pattern.facade.ShapeFacade

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

}