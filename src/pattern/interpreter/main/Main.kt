package pattern.interpreter.main

import pattern.interpreter.*
import pattern.interpreter.data.PersonData

fun main(args: Array<String>) {

    //翻譯器：給定一個語言, 定義它的文法的一種表示，並定義一個直譯器, 該直譯器使用該表示來解釋語言中的句子。
    //TODO condition 是已經定義好的條件規則，不需要更動

    //TODO 印出 條件1 有哪些人
    val condition1 = "年齡20-30"
    println("$condition1：")

    println()

    //TODO 印出 條件2 有哪些人
    val condition2 = "年齡20-30 而且 興趣旅行或運動"
    println("$condition2：")


}