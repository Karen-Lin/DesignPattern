package pattern.interpreter

import pattern.interpreter.data.PersonalInfo
import pattern.interpreter.data.Type

class ContainsExpression(private val type: Type, private val contains: ArrayList<String>) : Expression {

    override fun interpreter(nameList: MutableList<PersonalInfo>): List<PersonalInfo> {
        return nameList.filter {
            when (type) {
                Type.HOBBY -> {
                    it.hobbies.containsAll(contains)
                }
                else -> false
            }
        }
    }

}