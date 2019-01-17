package pattern.state

class DeliveredState : PackageState {

    override fun next(pcHomePackage: PCHomePackage) {
        println("Package delivered to post office, not received yet.")
        pcHomePackage.state = ReceivedState()
    }

}