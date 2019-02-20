package pattern.flyweight

class ConcreteWear(val name: String) : Wear {

    // 如果都需要穿上內衣褲
    private val baseDressCode = DressCode("內衣", "內褲", "")

    override fun change(dressCode: DressCode) {
        println("$name 穿上 ${checkDressCode(baseDressCode)}")
        println("$name 穿上 ${checkDressCode(dressCode)} 變身")
    }

    private fun checkDressCode(dressCode: DressCode): String {
        var dress = ""

        if (!isEmpty(dressCode.clothes)) {
            dress = "$dress[${dressCode.clothes}]"
        }

        if (!isEmpty(dressCode.pants)) {
            dress = "$dress[${dressCode.pants}]"
        }

        if (!isEmpty(dressCode.footwear)) {
            dress = "$dress[${dressCode.footwear}]"
        }

        return dress
    }

    private fun isEmpty(wear: String) = wear.isEmpty() || wear == "無"
}