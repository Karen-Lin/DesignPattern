package pattern.template.machine

class AmericanoMachine {

    fun start() {
        boilWater()
        brew()
        pourInCup()
        addHotWater()
    }


    private fun brew(){
        println("沖泡淺焙咖啡")
    }

    private fun boilWater() {
        println("煮熱水")
    }

    private fun pourInCup() {
        println("倒入杯子")
    }

    private fun addHotWater() {
        println("加熱水")
    }

}