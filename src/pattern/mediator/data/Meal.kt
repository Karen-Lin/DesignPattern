package pattern.mediator.data

import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

abstract class Meal(open var name: String) {
    protected var currentSettingTime: Date? = null
    private var otherMeals = ArrayList<Meal>()

    fun addOtherMealForChecking(vararg meal: Meal) {
        otherMeals.clear()
        otherMeals.addAll(meal)
    }

    fun reset() {
        otherMeals.clear()
        currentSettingTime = null
    }

    fun setTime(time: Date) {
        run loop@{
            otherMeals.forEach {
                if (!it.checkTimeSettingIsCorrect(this, time)) {
                    println("$name time setting failed.")
                    return@loop
                }
            }

            currentSettingTime = time
            println("$name time ${SimpleDateFormat("HH:mm").format(currentSettingTime)} setting success")
        }
    }

    abstract fun checkTimeSettingIsCorrect(meal: Meal, time: Date): Boolean
}