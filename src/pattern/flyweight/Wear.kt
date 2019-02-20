package pattern.flyweight


// 會隨著外在環境改變的資訊
data class DressCode(
    var clothes: String,
    var pants: String,
    var footwear: String
)

// 與外在環境無關的資訊
interface Wear {
    fun change(dressCode: DressCode)
}