package pattern.flyweight

class ClaireWear : Wear() {

    override val clothes: String = "高衩晚禮服"
    override val pants: String = "無"
    override val footwear: String = "高跟鞋"

    override fun change() {
        println("Claire [$clothes][$pants][$footwear] 變身")
    }

}