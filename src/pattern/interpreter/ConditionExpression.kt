package pattern.interpreter

import pattern.interpreter.data.PersonalInfo
import pattern.interpreter.data.Type

class ConditionExpression(private val conditions: String) : Expression {

    private val dash = '-'

    override fun interpreter(nameList: MutableList<PersonalInfo>): List<PersonalInfo> {
        val andExpressionList: MutableList<Expression> = ArrayList()
        conditions.split(" 而且 ").forEach { condition ->

            if (condition.contains(Type.AGE.field) && condition.contains(dash)) {

                andExpressionList.add(generateBetweenExpression(Type.AGE, condition))

            } else if (condition.contains(Type.HOBBY.field)) {

                andExpressionList.add(generateContainExpression(Type.HOBBY, condition))

            }
        }

        when (andExpressionList.size) {
            0 -> return emptyList()
            1 -> {
                return andExpressionList[0].interpreter(nameList)
            }
            2 -> {
                return AndExpression(andExpressionList[0], andExpressionList[1]).interpreter(nameList)
            }
            else -> {
                var andExpression = AndExpression(andExpressionList[0], andExpressionList[1])
                andExpressionList.forEachIndexed { index, expression ->
                    if (index >= 3) {
                        andExpression = AndExpression(expression, andExpression)
                    }
                }
                return andExpression.interpreter(nameList)
            }
        }
    }

    private fun generateBetweenExpression(type: Type, condition: String): Expression {
        val ageRange = condition.replace(type.field, "")
        val dashPosition = ageRange.indexOf(dash)
        val min = ageRange.substring(0, dashPosition).toInt()
        val max = ageRange.substring(dashPosition + 1, ageRange.length).toInt()
        return BetweenExpression(type, min, max)
    }

    private fun generateContainExpression(type: Type, condition: String): Expression {
        val hobbyExpression: MutableList<Expression> = ArrayList()
        condition
            .replace(type.field, "")
            .split("或")
            .forEach {
                hobbyExpression.add(ContainsExpression(type, arrayListOf(it)))
            }
        return OrExpression(hobbyExpression[0], hobbyExpression[1])
    }

}