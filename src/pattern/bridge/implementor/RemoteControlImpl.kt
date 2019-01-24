package pattern.bridge.implementor

// Implementor 會變動的 function
// 根據不同需求去實作介面
interface RemoteControlImpl {
    fun turnOn()
    fun turnOff()
}