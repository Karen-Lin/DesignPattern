package pattern.bridge

fun main(args: Array<String>) {

    val control = ArrayList<RemoteControl>()
    control.add(SonyVoiceControl())
    control.add(SonyButtonControl())
    control.add(SamsungVoiceControl())
    control.add(SamsungButtonControl())

    control.forEach { it.on() }
    control.forEach { it.off() }

    // 橋接模式把抽象和實作分開，如此他們兩個可以互相獨立
}