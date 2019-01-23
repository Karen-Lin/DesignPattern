package pattern.bridge

import pattern.bridge.implementor.ButtonControlImpl
import pattern.bridge.implementor.VoiceControlImpl
import pattern.bridge.abstraction.RemoteControl
import pattern.bridge.abstraction.SamsungControl
import pattern.bridge.abstraction.SonyControl

fun main(args: Array<String>) {

    val control = ArrayList<RemoteControl>()
    control.add(SonyControl(ButtonControlImpl()))
    control.add(SonyControl(VoiceControlImpl()))
    control.add(SamsungControl(ButtonControlImpl()))
    control.add(SamsungControl(VoiceControlImpl()))

    control.forEach { it.on() }
    control.forEach { it.off() }
}