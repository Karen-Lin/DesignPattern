package pattern.memento

class Originator(private val name: String) {

    var money: Int = 50
        private set

    // 儲存目前有多少 $$
    fun set(monkey: Int) {
        this.money = monkey
    }

    // 存檔產生紀錄
    fun saveToMemento(): Player {
        return Player(name, money)
    }

    // 回到上一個記錄檔 $$
    fun restoreFromMemento(player: Player) {
        money = player.money
    }
}