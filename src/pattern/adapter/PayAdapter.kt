package pattern.adapter

class PayAdapter : Payment() {

    var badge = Badge()
    override fun pay(): String {
        return badge.payFromCompany()
    }
}