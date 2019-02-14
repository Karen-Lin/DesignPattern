package pattern.mediator.data

import pattern.mediator.MealMediator
import java.util.*

data class Launch(override var name: String = "Launch", override var mediator: MealMediator): Meal(name, mediator) {

    override fun checkTimeSettingIsCorrect(meal: Meal, time: Date): Boolean {
        return when(meal) {
            is Breakfast -> {
                time.before(currentSettingTime).apply {
                    if (!this) {
                      println("${meal.name} time should be earlier than Launch time.")
                    }
                }
            }
            is Dinner -> {
                time.after(currentSettingTime).apply {
                    if (!this) {
                        println("${meal.name} time should be later than Launch time.")
                    }
                }
            }
            else -> {
                false
            }
        }
    }
}