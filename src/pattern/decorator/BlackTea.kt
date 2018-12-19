package pattern.decorator

class BlackTea : Drink() {

    override fun getContent(): String {
        return "紅茶"
    }

    override fun cost(): Int {
        return 20
    }

}