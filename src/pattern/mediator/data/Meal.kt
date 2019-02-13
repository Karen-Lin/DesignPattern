package pattern.mediator.data

import pattern.mediator.MealMediator
import java.util.*

abstract class Meal(open var name: String, open var mediator: MealMediator) {
    protected var currentSettingTime: Date? = null

    fun setTime(time: Date) {
        // TODO Use mediator to check time setting is correct or not
        /**
         * if the time is correct, set to the currentSettingTime and  println("$name time ${SimpleDateFormat("HH:mm").format(currentSettingTime)} setting success")
         * else println("$name time setting failed.")
         *
         */
    }

    abstract fun checkTimeSettingIsCorrect(meal: Meal, time: Date): Boolean
}