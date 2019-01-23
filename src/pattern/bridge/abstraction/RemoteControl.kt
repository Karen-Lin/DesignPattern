package pattern.bridge.abstraction

// Abstraction
abstract class RemoteControl {
    abstract val tvName: String
    abstract fun on()
    abstract fun off()
}