package pattern.interpreter

import pattern.interpreter.data.PersonalInfo


interface Expression {

    fun interpreter(nameList: MutableList<PersonalInfo>): List<PersonalInfo>

}