package pattern.bridge

class SamsungButtonControl : SamsungControl() {

    override fun samsungTurnOn() {
        println("$tvName 按鈕打開")
    }

    override fun samsungTurnOff() {
        println("$tvName 按鈕關閉")
    }

}