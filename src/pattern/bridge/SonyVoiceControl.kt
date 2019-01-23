package pattern.bridge

class SonyVoiceControl : SonyControl() {

    override fun sonyTurnOn() {
        println("$tvName 聲控打開")
    }

    override fun sonyTurnOff() {
        println("$tvName 聲控關閉")
    }

}