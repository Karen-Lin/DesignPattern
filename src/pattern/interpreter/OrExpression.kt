package pattern.interpreter

import pattern.interpreter.data.PersonalInfo
import java.util.ArrayList

//TODO 1.implement Expression   2.實作 interpreter() 取得 expr1 和 expr2 的聯集(union)
class OrExpression(private val expr1: Expression, private val expr2: Expression) {


    /*
    ArrayList<PersonalInfo>(expr1.interpreter(nameList))
    union(expr2.interpreter(nameList))
    toList()
    */

}
