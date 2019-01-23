package pattern.bridge

class SamsungButtonControl : SamsungControl() {

    override fun samsungOn() {
        println("$tvName 按鈕打開")
    }

    override fun samsungOff() {
        println("$tvName 按鈕關閉")
    }

}