package pattern.bridge.brand

class VoiceTv : TvFunction {
    override fun on() {
        println("聲音開啟")
    }

    override fun off() {
        println("聲音關閉")
    }
}