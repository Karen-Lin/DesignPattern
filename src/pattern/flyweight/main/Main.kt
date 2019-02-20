package pattern.flyweight.main

import pattern.flyweight.*


fun main(args: Array<String>) {
    val wearList = ArrayList<Wear>()
    wearList.add(KarenWear())
    wearList.add(LeeWear())
    wearList.add(ClaireWear())
    wearList.add(AminWear())
    wearList.forEach { it.change() }

    /**
     * 目的
     * - 以共享機制有效的支援一大堆小規模的物件
     **/
}