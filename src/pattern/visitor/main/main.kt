package pattern.visitor.main

import pattern.visitor.data.Book
import pattern.visitor.data.Fruit
import pattern.visitor.data.Game

fun main(args: Array<String>) {


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
    )

    //TODO Init CategoryVisitor, use it to visit all products and print category info

}