package pattern.bridge.abstraction

import pattern.bridge.implementor.RemoteControlImpl

class SonyControl(private val remoteControlImpl: RemoteControlImpl) : RemoteControl() {
    override val tvName: String = "sony"

    override fun on() {
        println(tvName)
        remoteControlImpl.turnOn()
    }

    override fun off() {
        println(tvName)
        remoteControlImpl.turnOff()
    }
}