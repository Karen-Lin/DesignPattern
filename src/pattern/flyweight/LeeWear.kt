package pattern.flyweight

class LeeWear : Wear() {

    override val clothes: String = "包屁衣"
    override val pants: String = "無"
    override val footwear: String = "啾啾鞋"

    override fun change() {
        println("佳恩 [$clothes][$pants][$footwear] 變身")
    }

}