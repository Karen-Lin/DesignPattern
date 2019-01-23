package pattern.bridge.abstraction

// Abstraction
// 把基本不會變動的抽象出來，每個品牌電視都要有的
// tvName , on() , off()
abstract class RemoteControl {
    abstract val tvName: String
}