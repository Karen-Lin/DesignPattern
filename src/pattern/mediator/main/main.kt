package pattern.mediator.main

import pattern.mediator.MealMediator
import pattern.mediator.data.Breakfast
import pattern.mediator.data.Dinner
import pattern.mediator.data.Launch
import pattern.mediator.data.Time

fun main(args: Array<String>) {
    val mealMediator = MealMediator()
    var breakfast = Breakfast(mediator = mealMediator)
    var launch = Launch(mediator = mealMediator)
    var dinner = Dinner(mediator = mealMediator)

    // Test setting success situation
    breakfast.setTime(Time.EIGHT_CLOCK_AM.date)
    launch.setTime(Time.TWELVE_CLOCK_PM.date)
    dinner.setTime(Time.SEVEN_CLOCK_PM.date)

    mealMediator.detachAll()

    // Test setting failed situation
    breakfast.setTime(Time.SEVEN_CLOCK_PM.date)
    launch.setTime(Time.SEVEN_CLOCK_PM.date)
    dinner.setTime(Time.EIGHT_CLOCK_AM.date)

}