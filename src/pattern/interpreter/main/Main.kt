package pattern.interpreter.main

import pattern.interpreter.*
import pattern.interpreter.data.PersonData

fun main(args: Array<String>) {

    val condition1 = "年齡20-30"
    println("$condition1：")
    ConditionExpression(condition1)
        .interpreter(PersonData().nameList)
        .forEach {
            println(" ＊ $it")
        }

    println()

    val condition2 = "年齡20-30 而且 興趣旅行或運動"
    println("$condition2：")
    ConditionExpression(condition2)
        .interpreter(PersonData().nameList)
        .forEach {
            println(" ＊ $it")
        }

}