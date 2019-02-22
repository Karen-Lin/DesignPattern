package pattern.interpreter.data

data class PersonalInfo(
    val name: String,
    val age: Int,
    val gender: Boolean,
    val hobbies: MutableList<String>)