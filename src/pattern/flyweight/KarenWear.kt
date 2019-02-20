package pattern.flyweight

class KarenWear : Wear() {

    override val clothes: String = "燕尾服"
    override val pants: String = "西裝褲"
    override val footwear: String = "皮鞋"

    override fun change() {
        println("Karen [$clothes][$pants][$footwear] 變身")
    }

}