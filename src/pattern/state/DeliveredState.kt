package pattern.state

class DeliveredState : PackageState {

    // TODO print current state msg and switch to next state
    override fun changeState(pack: PCHomePackage) {
        println("Package delivered to post office, not received yet.")
        pack.state = ReceivedState()
    }
}