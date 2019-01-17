package pattern.factory

fun main(args: Array<String>) {

    /** Factory pattern **/
    val beefHamburger = Hamburger("白麵包", "牛肉", "生菜")
    beefHamburger.cooking()
    val porkHamburger = Hamburger("全麥麵包", "豬肉", "洋蔥")
    porkHamburger.cooking()
    // 很容易做錯放錯材料，得到結果和預期可能會不一樣
}