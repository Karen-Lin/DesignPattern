package pattern.bridge

abstract class SonyControl : RemoteControl {
    override val tvName: String = "sony"

    abstract fun sonyOn()
    abstract fun sonyOff()

    override fun on() {
        sonyOn()
    }

    override fun off() {
        sonyOff()
    }
}