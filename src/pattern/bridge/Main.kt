package pattern.bridge

import pattern.bridge.brand.ButtonTv
import pattern.bridge.brand.VoiceTv
import pattern.bridge.control.RemoteControl
import pattern.bridge.control.SamsungControl
import pattern.bridge.control.SonyControl

fun main(args: Array<String>) {

    val control = ArrayList<RemoteControl>()
    control.add(SonyControl(ButtonTv()))
    control.add(SonyControl(VoiceTv()))
    control.add(SamsungControl(ButtonTv()))
    control.add(SamsungControl(VoiceTv()))

    control.forEach { it.on() }
    control.forEach { it.off() }
}