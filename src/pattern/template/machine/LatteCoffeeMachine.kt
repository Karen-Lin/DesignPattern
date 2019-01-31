package pattern.template.machine

class LatteCoffeeMachine : CoffeeMachine() {

    override fun brew() {
        println("沖泡中深焙咖啡")
    }

    override fun addCondiments() {
        println("加入牛奶")
    }

}