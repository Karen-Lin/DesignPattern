package pattern.bridge.implementor

class VoiceControlImpl: RemoteControlImpl {
    override fun turnOn() = println("聲音開啟")

    override fun turnOff() = println("聲音關閉")
}