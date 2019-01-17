package pattern.state

class PCHomePackage constructor(var state: State? = State.ORDER) {

    enum class State {
        ORDER, DELIVERED, RECEIVED
    }

    fun order() {
        while (state != null) {
            checkState()
            Thread.sleep(1500)
        }
    }

    private fun checkState() {
        when(state) {
            State.ORDER -> {
                println("Package ordered, not delivered to the post office.")
                state = State.DELIVERED
            }
            State.DELIVERED -> {
                println("Package delivered to post office, not received yet.")
                state = State.RECEIVED

            }
            State.RECEIVED -> {
                println("This package is already received by a client.")
                state = null
            }
        }
    }

}