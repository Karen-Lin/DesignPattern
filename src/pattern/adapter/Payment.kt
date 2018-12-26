package pattern.adapter

open class Payment {

    open fun pay(): String {
        return "請選擇付款方式"
    }
}