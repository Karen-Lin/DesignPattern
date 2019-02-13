package pattern.visitor.main

import pattern.visitor.data.Book
import pattern.visitor.data.Fruit
import pattern.visitor.data.Game

fun main(args: Array<String>) {

    val fruits = ArrayList<Fruit>()
    val books = ArrayList<Book>()
    val games = ArrayList<Game>()

    listOf(
        Book("懦夫秘笈", 200),
        Fruit("橘子", 10),
        Game("暗黑破壞神", 1790),
        Book("凱倫的50道陰影", 699),
        Book("木瓜之城", 350),
        Fruit("木瓜", 30),
        Game("塞爾達", 2050),
        Fruit("蘋果", 20),
        Game("馬力歐賽車", 1690),
        Fruit("北海道高級哈密瓜", 2200)
    ).forEach {
        when(it) {
            is Fruit -> {
                fruits.add(it)
            }
            is Book -> {
                books.add(it)
            }
            is Game -> {
                games.add(it)
            }
        }
    }

    println("總共有 ${fruits.size} 個水果, $fruits")
    println("總共有 ${books.size} 本書, $books")
    println("總共有 ${games.size} 片遊戲, $games")
}