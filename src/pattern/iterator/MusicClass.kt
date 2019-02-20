package pattern.iterator

class MusicClass {

    private var studentArray: Array<Student> = arrayOf(
        Student("魏仲廷"),
        Student("方芮欣"),
        Student("殷翠涵")
    )

    fun createIterator(): Iterator {
        return MusicClassIterator(studentArray)
    }

}