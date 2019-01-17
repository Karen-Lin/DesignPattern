package pattern.state

class ReceivedState : PackageState {

    override fun next(pcHomePackage: PCHomePackage) {
        println("This package is already received by a client.")
        pcHomePackage.state = null
    }

}