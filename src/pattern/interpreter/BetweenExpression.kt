package pattern.interpreter

import pattern.interpreter.data.PersonalInfo
import pattern.interpreter.data.Type

class BetweenExpression(private val type: Type, private val min: Int, private val max: Int) : Expression {

    override fun interpreter(nameList: MutableList<PersonalInfo>): List<PersonalInfo> {
        return nameList.filter {
            when (type) {
                Type.AGE -> {
                    it.age in min..max
                }
                else -> false
            }
        }
    }

}