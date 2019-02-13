package pattern.mediator.data

import pattern.mediator.MealMediator
import java.util.*

data class Dinner(override var name: String = "Dinner", override var mediator: MealMediator): Meal(name, mediator) {
    override fun checkTimeSettingIsCorrect(meal: Meal, time: Date): Boolean {
        return time.before(currentSettingTime).apply {
            if (!this) {
                println("${meal.name} time should be earlier than Dinner time.")
            }
        }
    }
}