package pattern.decorator.main

import pattern.decorator.BlackTea
import pattern.decorator.Flan
import pattern.decorator.PlasticBag
import pattern.decorator.TapiocaPearl

fun main() {

    //第一杯飲料
    val blackTea = BlackTea()
    val flan = Flan()
    val tapiocaPearl = TapiocaPearl()

    val drink1 = blackTea.content + "加" + flan.content + "加" + tapiocaPearl.content
    val drink1Cost = blackTea.cost + flan.cost + tapiocaPearl.cost
    println("你的飲料「$drink1」好了，一共 $drink1Cost 元")


    //第二杯飲料
    val plasticBag = PlasticBag()
    val drink2 = blackTea.content + "裝" + plasticBag.content
    val drink2Cost = blackTea.cost + plasticBag.cost
    println("你的飲料「$drink2」好了，一共 $drink2Cost 元")


}