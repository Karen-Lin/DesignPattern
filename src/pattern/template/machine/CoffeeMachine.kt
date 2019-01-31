package pattern.template.machine

abstract class CoffeeMachine {

    fun start() {
        boilWater()
        brew()
        pourInCup()
        addCondiments()
    }


    protected abstract fun brew()

    protected abstract fun addCondiments()

    private fun boilWater() {
        println("煮熱水")
    }

    private fun pourInCup() {
        println("倒入杯子")
    }

}