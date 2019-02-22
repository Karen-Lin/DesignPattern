package pattern.interpreter

import pattern.interpreter.data.PersonalInfo
import pattern.interpreter.data.Type

//TODO 1.implement Expression   2.實作 interpreter()
class ContainsExpression(private val type: Type, private val contains: ArrayList<String>) {


    /*
    return nameList.filter {
            when (type) {
                Type.HOBBY -> {
                    it.hobbies.containsAll(contains)
                }
                else -> false
            }
        }
     */
}