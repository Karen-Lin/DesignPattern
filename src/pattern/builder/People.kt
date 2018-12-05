package pattern.builder

// TODO Init People with Builder
class People private constructor() {

    val firstName: String // Required
    val lastName: String // Required
    val nickName: String? // Optional
    val phone: String? // Optional
    val address: String? // Optional

    init {
        // TODO Init people's variable with builder
    }

    // TODO Implement PeopleBuilder, firstName and lastName are required
    class PeopleBuilder {

    }
}
