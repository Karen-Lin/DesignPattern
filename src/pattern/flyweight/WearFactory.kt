package pattern.flyweight

class WearFactory private constructor() {

    private val wearList = ArrayList<ConcreteWear>()

    fun get(name: String): ConcreteWear {
        val concreteWear = wearList.find { it.name == name } ?: ConcreteWear(name).apply {
            wearList.add(this)
        }
        println("$name hashCode = ${concreteWear.hashCode()}")
        return concreteWear
    }

    companion object {
        val INSTANCE: WearFactory by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
            WearFactory()
        }
    }
}