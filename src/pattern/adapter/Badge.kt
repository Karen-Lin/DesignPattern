package pattern.adapter

class Badge : Payment() {

    override fun pay(): String {
        return "無法付款"
    }
}