package pattern.strategy

class RebateSale: SalePlan() {

    override fun getDiscount(): String {
        return "滿5000送500"
    }
}