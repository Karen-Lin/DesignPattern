package pattern.bridge

class SonyButtonControl : SonyControl() {

    override fun sonyOn() {
        println("$tvName 按鈕打開")
    }

    override fun sonyOff() {
        println("$tvName 按鈕關閉")
    }

}