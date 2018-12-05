package pattern

import pattern.builder.People

fun main(args: Array<String>) {

    println("Design pattern study group.")

    /** Builder pattern **/
    val people: People =
        People.PeopleBuilder("Karen", "Lin")
            .nickName("Taiwan Top Model")
            .address("Taipei Neihu")
            .phone("0988333333")
            .build()

}