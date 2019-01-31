package pattern.template.machine

class LatteCoffeeMachine {

    fun start() {
        boilWater()
        brew()
        pourInCup()
        addMilk()
    }


    private fun brew(){
        println("沖泡中深焙咖啡")
    }

    private fun boilWater() {
        println("煮熱水")
    }

    private fun pourInCup() {
        println("倒入杯子")
    }

    private fun addMilk() {
        println("加入牛奶")
    }

}