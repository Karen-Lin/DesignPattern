package pattern.iterator

class MusicClassIterator(private val studentArray: Array<Student>) : Iterator {

    private var position: Int = 0

    override fun hasNext(): Boolean {
        return position < studentArray.size
    }

    override fun next(): Any {
        val student = studentArray[position]
        position += 1
        return student
    }

}