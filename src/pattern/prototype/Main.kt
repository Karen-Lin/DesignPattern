package pattern.prototype

fun main(args: Array<String>) {

    val medicines: Medicines = Medicines()

    // TODO Made medicines include “正露丸” for Karen without using init new Medicines
    val medicinesForKaren = medicines.clone() as Medicines
    medicinesForKaren.add("正露丸")

    // TODO Made medicines include “青木瓜四物飲” for Amin without using init new Medicines
    val medicinesForAmin = medicines.clone() as Medicines
    medicinesForAmin.add("青木瓜四物飲")

    println("Karen's medicines: ${medicinesForKaren.medicineList}")
    println("Amin's medicines: ${medicinesForAmin.medicineList}")

}