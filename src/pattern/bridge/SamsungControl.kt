package pattern.bridge

abstract class SamsungControl : RemoteControl {
    override val tvName: String = "samsung"

    abstract fun samsungTurnOn()
    abstract fun samsungTurnOff()

    override fun on() {
        samsungTurnOn()
    }

    override fun off() {
        samsungTurnOff()
    }
}