package pattern.bridge.control

// Abstraction
interface RemoteControl {
    val tvName: String
    fun on()
    fun off()
}