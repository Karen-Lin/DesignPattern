package pattern.flyweight


class WearFactory private constructor() {

    private val wearList = ArrayList<ConcreteWear>()

    fun get(name: String): ConcreteWear {
        // println 用 hashCode 檢查類別是否有重複被利用
        return ConcreteWear(name).apply {
            println("$name hashCode: ${hashCode()}")
        }
    }

    companion object {
        val INSTANCE: WearFactory by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
            WearFactory()
        }
    }
}