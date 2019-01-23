package pattern.bridge

class SonyVoiceControl : SonyControl() {

    override fun sonyOn() {
        println("$tvName 聲控打開")
    }

    override fun sonyOff() {
        println("$tvName 聲控關閉")
    }

}