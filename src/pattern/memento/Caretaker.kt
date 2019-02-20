package pattern.memento

class Caretaker {

    private val memento = ArrayList<Player>()

    // TODO: 新增紀錄
    fun add() {
        println("新增紀錄：$memento")
    }

    // TODO: 覆蓋紀錄
    fun set() {
        println("覆蓋紀錄：$memento")
    }

    // TODO: 讀取紀錄
    fun undo() {
        println("讀取紀錄：$this")
    }

    // 清除記錄
    fun clear() {
        memento.clear()
        println("清除記錄：$memento")
    }

    fun show() {
        println("目前的紀錄：$memento")
    }
}