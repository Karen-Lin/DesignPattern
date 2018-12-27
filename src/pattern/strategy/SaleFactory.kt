package pattern.strategy

class SaleFactory {

    fun getChristmasSalePlan(): SalePlan {
        return SpecialOfferSale()
    }
}