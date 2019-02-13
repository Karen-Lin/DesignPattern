package pattern.mediator.data

import java.util.*

data class Dinner(override var name: String = "Dinner"): Meal(name) {
    override fun checkTimeSettingIsCorrect(meal: Meal, time: Date): Boolean {
        return currentSettingTime?.let {
            time.before(it).apply {
                if (!this) {
                    println("${meal.name} time should be earlier than Dinner time.")
                }

            }
        } ?: true
    }
}