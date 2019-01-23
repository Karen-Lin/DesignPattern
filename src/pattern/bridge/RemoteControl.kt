package pattern.bridge

interface RemoteControl {
    val tvName: String
    fun on()
    fun off()
}