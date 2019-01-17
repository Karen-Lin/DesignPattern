package pattern.state

class PCHomePackage constructor(var state: PackageState? = OrderState()) {

    fun order() {
        while (state != null) {
            state?.next(this)
            Thread.sleep(1500)
        }
    }

}