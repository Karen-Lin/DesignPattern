package pattern.flyweight

class AminWear : Wear() {

    override val clothes: String = "制服"
    override val pants: String = "百褶裙"
    override val footwear: String = "學生鞋"

    override fun change() {
        println("Amin [$clothes][$pants][$footwear] 變身")
    }

}