package pattern.strategy

open class SalePlan {

    open fun getDiscount(): String {
        return "沒有打折"
    }
}