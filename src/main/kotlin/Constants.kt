import java.time.LocalDate
import java.time.Period

fun main() {
//    simple()
    complex()
}

fun simple() {
    println("What is your name?")
    val name = readLine()
    println("What year were you born?")
    val year = readLine()!!.toInt()
    println("Hi, $name! You are now ${LocalDate.now().year - year} years old")
}

fun complex() {
    println("What is your name?")
    val name = readLine()
    println("When is your birthday? dd-mm-yyyy")
    val (day, month, year) = readLine()!!.split("-").map {it.toInt()}
    val timeDifference = Period.between(
        LocalDate.of(year, month, day), // birthdate
        LocalDate.now()) // current day
    val ageDays = timeDifference.days
    val ageMonths = timeDifference.months
    val ageYears = timeDifference.years
    println("Hi, $name! You are $ageYears years, $ageMonths months, and $ageDays days old.")
}
