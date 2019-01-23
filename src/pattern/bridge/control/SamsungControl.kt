package pattern.bridge.control

import pattern.bridge.brand.TvFunction

class SamsungControl(private val tvFunction: TvFunction) : RemoteControl {
    override val tvName: String = "samsung"

    override fun on() {
        println(tvName)
        tvFunction.on()
    }

    override fun off() {
        println(tvName)
        tvFunction.off()
    }
}