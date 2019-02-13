package pattern.mediator.data

import java.util.*

data class Breakfast(override var name: String = "Breakfast"): Meal(name) {
    override fun checkTimeSettingIsCorrect(meal: Meal, time: Date): Boolean {
        return currentSettingTime?.let {
            time.after(it).apply {
                if (!this) {
                    println("${meal.name} time should be later than Breakfast time.")
                }

            }
        } ?: true
    }
}