package pattern.iterator

fun main(args: Array<String>) {

    println("========== 音樂課 點名 ==========")
    Teacher().rollCall(MusicClass().studentArray)

    println("========== 繪畫課 點名 ==========")
    Teacher().rollCall(PaintingClass().studentList)

}

class Teacher {

    fun rollCall(studentArray: Array<Student>) {
        for(student in studentArray) {
            println("$student")
        }
    }

    fun rollCall(studentList: ArrayList<Student>) {
        for(student in studentList) {
            println("$student")
        }
    }

}