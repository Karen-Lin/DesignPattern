package pattern.iterator

class PaintingClassIterator(private val studentList: ArrayList<Student>) : Iterator {

    private var position: Int = 0

    override fun hasNext(): Boolean {
        return position < studentList.size
    }

    override fun next(): Any {
        val student = studentList[position]
        position += 1
        return student
    }

}