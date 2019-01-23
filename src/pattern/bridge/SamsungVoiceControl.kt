package pattern.bridge

class SamsungVoiceControl : SamsungControl() {

    override fun samsungTurnOn() {
        println("$tvName 聲控打開")
    }

    override fun samsungTurnOff() {
        println("$tvName 聲控關閉")
    }

}