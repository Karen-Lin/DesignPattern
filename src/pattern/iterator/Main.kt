package pattern.iterator

fun main(args: Array<String>) {

    println("========== 音樂課 點名 ==========")
    teacherRollCall(MusicClass().createIterator())

    println("========== 繪畫課 點名 ==========")
    teacherRollCall(PaintingClass().createIterator())

}

private fun teacherRollCall(iterator: Iterator) {
    while (iterator.hasNext()) {
        println("${iterator.next()}")
    }
}