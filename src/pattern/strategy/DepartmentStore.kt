package pattern.strategy

class DepartmentStore(private var type: String) {

    var salePlan = SalePlan()

    init {
        //TODO Implement different SalePlan by type

    }

    fun getSaleDiscount(): String {
        return salePlan.getDiscount()
    }
}