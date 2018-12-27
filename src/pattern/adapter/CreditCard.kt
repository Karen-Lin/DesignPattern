package pattern.adapter

class CreditCard : Payment() {

    override fun pay(): String {
        return "信用卡付款"
    }
}