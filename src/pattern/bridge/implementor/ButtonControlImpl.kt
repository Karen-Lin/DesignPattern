package pattern.bridge.implementor


class ButtonControlImpl: RemoteControlImpl {
    override fun turnOn() = println("按鈕開啟")

    override fun turnOff() = println("按鈕關閉")
}