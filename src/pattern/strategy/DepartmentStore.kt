package pattern.strategy

class DepartmentStore(private var type: String) {

    fun getSaleDiscount(): String {

        var salePlan = SalePlan()
        when(type) {
            "SpecialOfferSale" -> salePlan = SpecialOfferSale()
            "RebateSale" -> salePlan = RebateSale()
            "DiscountSale" -> salePlan = DiscountSale()
        }
        return salePlan.getDiscount()
    }
}