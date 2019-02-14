package pattern.mediator

import pattern.mediator.data.Meal
import java.util.*

class MealMediator {
    var meals = ArrayList<Meal>()

    fun attach(meal: Meal) {
        if (!meals.contains(meal)) {
            meals.add(meal)
        }
    }

    fun detach(meal: Meal) {
        if (meals.contains(meal)) {
            meals.remove(meal)
        }
    }

    fun detachAll() {
        meals.clear()
    }

    fun setTime(meal: Meal, time: Date): Boolean {
        //TODO Implement meal setting time logic
    }
}