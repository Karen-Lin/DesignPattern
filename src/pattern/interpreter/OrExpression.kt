package pattern.interpreter

import pattern.interpreter.data.PersonalInfo
import java.util.ArrayList

class OrExpression(private val exr1: Expression, private val exr2: Expression) : Expression {

    override fun interpreter(nameList: MutableList<PersonalInfo>): List<PersonalInfo> {
        return ArrayList<PersonalInfo>(exr1.interpreter(nameList))
            .union(exr2.interpreter(nameList))
            .toList()
    }


}