package pattern.state

class ReceivedState : PackageState {

    // TODO print current state msg and switch to next state
    override fun changeState(pack: PCHomePackage) {
        println("This package is already received by a client.")
        pack.state = null
    }
}