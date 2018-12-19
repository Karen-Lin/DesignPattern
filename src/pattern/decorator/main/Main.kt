package pattern.decorator.main

import pattern.decorator.BlackTea
import pattern.decorator.Flan
import pattern.decorator.PlasticBag
import pattern.decorator.TapiocaPearl

fun main() {

    val drink = Flan(TapiocaPearl(BlackTea()))
    println("你的飲料「${drink.getContent()}」好了，一共${drink.cost()}元")

    val blackTea = PlasticBag(BlackTea())
    println("你的飲料「${blackTea.getContent()}」好了，一共${blackTea.cost()}元")

}