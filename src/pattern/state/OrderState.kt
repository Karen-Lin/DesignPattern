package pattern.state

class OrderState : PackageState {
    // TODO print current state msg and switch to next state

    override fun changeState(pack: PCHomePackage) {
         println("Package ordered, not delivered to the post office.")
        pack.state = DeliveredState()
    }
}