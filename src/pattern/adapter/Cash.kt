package pattern.adapter

class Cash : Payment() {

    override fun pay(): String {
        return "現金付款"
    }
}