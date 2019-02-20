package pattern.memento

class Originator(private val name: String) {

    var money: Int = 50
        private set

    // TODO: 儲存目前有多少 $$
    fun set() {
    }

    // TODO: 存檔產生紀錄
    fun saveToMemento() {
    }

    // TODO: 回到上一個記錄檔 $$
    fun restoreFromMemento() {
    }
}