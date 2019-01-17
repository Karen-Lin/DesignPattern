package pattern.prototype

data class Medicines constructor(var medicineList: MutableList<String> = ArrayList()) : Cloneable {

    init {
        loadDataFromDB()
    }

    private fun loadDataFromDB() {
        medicineList.add("鐵牛運功散")
        medicineList.add("川貝枇杷膏")
        medicineList.add("吉胃福適錠")
        medicineList.add("正記消痔丸")
    }

    fun add(medicine: String) {
        medicineList.add(medicine)
    }

    public override fun clone(): Medicines {
        val clone = super.clone() as Medicines
        val cloneMedicineList = ArrayList<String>()
        medicineList.forEach {
            cloneMedicineList.add(it)
        }
        clone.medicineList = cloneMedicineList
        return clone
    }

}