package pattern.mediator.main

import pattern.mediator.data.Breakfast
import pattern.mediator.data.Dinner
import pattern.mediator.data.Launch
import pattern.mediator.data.Time

fun main(args: Array<String>) {
    val breakfast = Breakfast()
    val launch = Launch()
    val dinner = Dinner()

    // Test setting success situation
    init(breakfast, launch, dinner)
    breakfast.setTime(Time.EIGHT_CLOCK_AM.date)
    launch.setTime(Time.TWELVE_CLOCK_PM.date)
    dinner.setTime(Time.SEVEN_CLOCK_PM.date)

    // Test setting failed situation
    init(breakfast, launch, dinner)
    breakfast.setTime(Time.SEVEN_CLOCK_PM.date)
    launch.setTime(Time.SEVEN_CLOCK_PM.date)
    dinner.setTime(Time.EIGHT_CLOCK_AM.date)

}

fun init(breakfast: Breakfast, launch: Launch, dinner: Dinner) {
    breakfast.reset()
    launch.reset()
    dinner.reset()
    breakfast.addOtherMealForChecking(launch, dinner)
    launch.addOtherMealForChecking(breakfast, dinner)
    dinner.addOtherMealForChecking(breakfast, launch)
}