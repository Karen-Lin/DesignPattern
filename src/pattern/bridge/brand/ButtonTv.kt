package pattern.bridge.brand

class ButtonTv : TvFunction {
    override fun on() {
        println("按鈕開啟")
    }

    override fun off() {
        println("按鈕關閉")
    }
}