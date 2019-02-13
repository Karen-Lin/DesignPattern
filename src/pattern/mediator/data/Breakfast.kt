package pattern.mediator.data

import pattern.mediator.MealMediator
import java.util.*

data class Breakfast(override var name: String = "Breakfast", override var mediator: MealMediator): Meal(name, mediator) {
    override fun checkTimeSettingIsCorrect(meal: Meal, time: Date): Boolean {
        return time.after(currentSettingTime).apply {
            if (!this) {
                println("${meal.name} time should be later than Breakfast time.")
            }
        }
    }
}