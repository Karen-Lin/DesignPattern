package pattern.memento

class Caretaker {

    private val memento = ArrayList<Player>()

    // 新增紀錄
    fun add(player: Player) {
        memento.add(player)
        println("新增紀錄：$memento")
    }

    // 覆蓋紀錄
    fun set(player: Player) {
        memento.find { player.name == it.name }?.money = player.money
        println("覆蓋紀錄：$memento")
    }

    // 讀取紀錄
    fun undo(): Player {
        return memento[memento.lastIndex].apply {
            println("讀取紀錄：$this")
        }
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