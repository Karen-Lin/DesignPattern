package pattern.strategy

class SaleFactory {

    fun getSalePlan(): SalePlan {
        return SpecialOfferSale()
    }
}