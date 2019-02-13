package pattern.mediator.data

import java.util.*

data class Launch(override var name: String = "Launch"): Meal(name) {

    override fun checkTimeSettingIsCorrect(meal: Meal, time: Date): Boolean {
        return currentSettingTime?.let {
            when(meal) {
                is Breakfast -> {
                    time.before(it).apply {
                        if (!this) {
                            println("${meal.name} time should be earlier than Launch time.")
                        }
                    }
                }
                is Dinner -> {
                    time.after(it).apply {
                        if (!this) {
                            println("${meal.name} time should be later than Launch time.")
                        }
                    }
                }
                else -> {
                    false
                }
            }
        } ?: true
    }
}