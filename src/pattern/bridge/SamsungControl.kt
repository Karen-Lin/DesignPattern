package pattern.bridge

abstract class SamsungControl : RemoteControl {
    override val tvName: String = "samsung"

    abstract fun samsungOn()
    abstract fun samsungOff()

    override fun on() {
        samsungOn()
    }

    override fun off() {
        samsungOff()
    }
}