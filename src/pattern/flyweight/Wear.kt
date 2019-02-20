package pattern.flyweight

/*
var clothes: String
var pants: String
var footwear: String
fun change()
 */

// 會隨著外在環境改變的資訊
data class DressCode(var clothes: String = "")

// 與外在環境無關的資訊
interface Wear {
}