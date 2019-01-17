package pattern.builder

fun main(args: Array<String>) {

    val people: People =
        People.PeopleBuilder("Karen", "Lin")
            .nickName("Taiwan Top Model")
            .address("Taipei Neihu")
            .phone("0988333333")
            .build()
}