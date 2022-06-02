import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val startTime = scanner.nextLine().split(" ")
    val processMinutes = scanner.nextInt()
    val startMinutes = (startTime[0].toInt() * 60) + startTime[1].toInt()
    val endHour = (startMinutes + processMinutes) / 60
    val endMinutes = (startMinutes + processMinutes) % 60
    print("${ if (endHour >= 24) endHour - 24 else endHour } $endMinutes")
}