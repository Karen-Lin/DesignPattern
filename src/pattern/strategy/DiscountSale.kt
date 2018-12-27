package pattern.strategy

class DiscountSale: SalePlan() {

    override fun getDiscount(): String {
        return "打九折"
    }
}