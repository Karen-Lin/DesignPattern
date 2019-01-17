package pattern.state

class OrderState : PackageState {

    override fun next(pcHomePackage: PCHomePackage) {
        println("Package ordered, not delivered to the post office.")
        pcHomePackage.state = DeliveredState()
    }

}