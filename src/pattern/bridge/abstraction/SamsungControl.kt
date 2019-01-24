package pattern.bridge.abstraction

import pattern.bridge.implementor.RemoteControlImpl

class SamsungControl(var remote: RemoteControlImpl) : RemoteControl() {
    override val tvName: String = "samsung"

    override fun on() {
        println(tvName)
        remote.turnOn()
    }
    override fun off() {
        println(tvName)
        remote.turnOff()
    }
}