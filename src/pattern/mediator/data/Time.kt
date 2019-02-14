package pattern.mediator.data

import java.util.*
import java.text.SimpleDateFormat



enum class Time(val date: Date) {
    EIGHT_CLOCK_AM(SimpleDateFormat("HH:mm").parse("8:00")),
    TWELVE_CLOCK_PM(SimpleDateFormat("HH:mm").parse("12:00")),
    SEVEN_CLOCK_PM(SimpleDateFormat("HH:mm").parse("19:00"))
}