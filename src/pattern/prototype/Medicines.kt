package pattern.prototype


// TODO implement Cloneable for Medicines
data class Medicines constructor(var medicineList: MutableList<String> = ArrayList()): Cloneable {

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

    public override fun clone(): Any {
        var medicine = super.clone() as Medicines
        var arrayList = ArrayList<String>()
        medicineList.forEach {
            arrayList.add(it)
        }
        medicine.medicineList = arrayList
        return medicine
    }

    override fun hashCode(): Int {
        return 31 * super.hashCode() + medicineList!!.hashCode()
    }
}