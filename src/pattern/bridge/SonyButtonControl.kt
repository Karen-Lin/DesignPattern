package pattern.bridge

class SonyButtonControl : SonyControl() {

    override fun sonyTurnOn() {
        println("$tvName 按鈕打開")
    }

    override fun sonyTurnOff() {
        println("$tvName 按鈕關閉")
    }

}