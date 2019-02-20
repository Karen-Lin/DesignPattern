package pattern.iterator

class PaintingClass {

    private var studentList: ArrayList<Student> = arrayListOf(
        Student("淇淇"),
        Student("美心"),
        Student("慈孤")
    )

    fun createIterator(): Iterator {
        return PaintingClassIterator(studentList)
    }

}