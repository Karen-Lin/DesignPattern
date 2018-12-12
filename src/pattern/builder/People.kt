package pattern.builder


class People private constructor(builder: PeopleBuilder) {

    val firstName: String
    val lastName: String
    val nickName: String?
    val phone: String?
    val address: String?

    init {
        this.firstName = builder.firstName
        this.lastName = builder.lastName
        this.nickName = builder.nickName
        this.phone = builder.phone
        this.address = builder.address
    }

    class PeopleBuilder(val firstName: String, val lastName: String) {
        var nickName: String? = null
        var address: String? = null
        var phone: String? = null


        fun nickName(nickName: String): PeopleBuilder {
            this.nickName = nickName
            return this
        }

        fun phone(phone: String): PeopleBuilder {
            this.phone = phone
            return this
        }

        fun address(address: String): PeopleBuilder {
            this.address = address
            return this
        }

        fun build(): People {
            return People(this)
        }
    }
}

