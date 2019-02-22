package pattern.interpreter.main

import pattern.interpreter.data.PersonData

fun main(args: Array<String>) {

    val friendList = PersonData().nameList

    println("尋找 20~30歲之間的網友：")
    friendList.forEach {
        if (it.age in 20..30) {
            println(" ＊ $it, ")
        }
    }
    println()

    println("尋找 20~30歲之間，而且喜歡旅行或運動的網友：")
    friendList.forEach {
        if (it.age in 20..30 && it.hobbies.contains("旅行") || it.hobbies.contains("運動")) {
            println(" ＊ $it, ")
        }
    }

}