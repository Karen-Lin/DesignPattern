package pattern.bridge.abstraction

import pattern.bridge.implementor.RemoteControlImpl

class SonyControl(var remote: RemoteControlImpl) : RemoteControl() {
    override val tvName: String = "sony"

    override fun on() {
        println(tvName)
        remote.turnOn()
    }
    override fun off() {
        println(tvName)
        remote.turnOff()
    }
}