package pattern.bridge

class SamsungVoiceControl : SamsungControl() {

    override fun samsungOn() {
        println("$tvName 聲控打開")
    }

    override fun samsungOff() {
        println("$tvName 聲控關閉")
    }

}