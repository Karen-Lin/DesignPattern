package pattern.flyweight

// println("$name 穿上 ${checkDressCode(dressCode)} 變身")
class ConcreteWear(val name: String) : Wear {

    private fun checkDressCode(dressCode: DressCode): String {
        var dress = ""

        if (!isEmpty(dressCode.clothes)) {
            dress = "$dress[${dressCode.clothes}]"
        }

        // 自行解開
        /*
        if (!isEmpty(dressCode.pants)) {
            dress = "$dress[${dressCode.pants}]"
        }

        if (!isEmpty(dressCode.footwear)) {
            dress = "$dress[${dressCode.footwear}]"
        }*/

        return dress
    }

    private fun isEmpty(wear: String) = wear.isEmpty() || wear == "無"
}