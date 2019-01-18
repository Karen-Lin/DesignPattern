package pattern.state

class PCHomePackage constructor(var state: PackageState? = OrderState()) {

    fun order() {
        while (state != null) {
            //TODO Implement check state by state pattern
            state?.changeState(this)
            Thread.sleep(1500)
        }
    }

}