package pattern.bridge

abstract class SonyControl : RemoteControl {
    override val tvName: String = "sony"

    abstract fun sonyTurnOn()
    abstract fun sonyTurnOff()

    override fun on() {
        sonyTurnOn()
    }

    override fun off() {
        sonyTurnOff()
    }
}