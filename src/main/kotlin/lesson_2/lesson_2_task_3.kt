package lesson_2

fun main() {
    var departureTimes = (9 * 60) + 39
    var travelTimes = 457
    var allTimes = departureTimes + travelTimes

    var arrivalHours = allTimes / 60
    var arrivalMinutes = allTimes % 60

    println("$arrivalHours:$arrivalMinutes")


}