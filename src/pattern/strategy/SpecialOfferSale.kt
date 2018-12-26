package pattern.strategy

class SpecialOfferSale: SalePlan() {

    override fun getDiscount(): String {
        return "滿10000送500+換季大拍賣"
    }
}