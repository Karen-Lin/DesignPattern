package pattern.mediator.data

import pattern.mediator.MealMediator
import java.text.SimpleDateFormat
import java.util.*

abstract class Meal(open var name: String, open var mediator: MealMediator) {
    protected var currentSettingTime: Date? = null

    fun setTime(time: Date) {
        mediator.attach(this)
        if (mediator.setTime(this, time)) {
            currentSettingTime = time
            println("$name time ${SimpleDateFormat("HH:mm").format(currentSettingTime)} setting success")
        } else {
            println("$name time setting failed.")
        }
    }

    abstract fun checkTimeSettingIsCorrect(meal: Meal, time: Date): Boolean
}