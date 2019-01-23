package pattern.bridge.abstraction

import pattern.bridge.implementor.RemoteControlImpl

class SamsungControl(private val remoteControlImpl: RemoteControlImpl) : RemoteControl() {
    override val tvName: String = "samsung"

    override fun on() {
        println(tvName)
        remoteControlImpl.turnOn()
    }

    override fun off() {
        println(tvName)
        remoteControlImpl.turnOff()
    }
}