package pattern.prototype

fun main(args: Array<String>) {

    val medicinesForKaren = Medicines()
    medicinesForKaren.add("正露丸")

    val medicinesForAmin = Medicines()
    medicinesForAmin.add("青木瓜四物飲")

    println("Karen's medicines: ${medicinesForKaren.medicineList}")
    println("Amin's medicines: ${medicinesForAmin.medicineList}")

}