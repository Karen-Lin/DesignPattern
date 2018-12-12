package pattern.factory

// TODO 每個漢堡組成都是 bread + meat + vegetables
// TODO 只是口味不同

interface Hamburger {
    val bread: String
    val meat: String
    val vegetables: String

    fun cooking() {}
}