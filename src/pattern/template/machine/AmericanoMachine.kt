package pattern.template.machine

class AmericanoMachine : CoffeeMachine() {

    override fun brew() {
        println("沖泡淺焙咖啡")
    }

    override fun addCondiments() {
        println("加熱水")
    }

}