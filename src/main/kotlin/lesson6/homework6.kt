package com.isaev.lesson6

fun main () {
    println(seasonDefinition(5))
    println(ageOfThePet(18))
    println(transport(6))
    println(bonusRubles(1500))
}

fun seasonDefinition (month: Int?) : Any {
    return if (month in 1..2 || month == 12) {
        "Winter"
    } else if (month in 3..5) {
        "Spring"
    } else if (month in 6..8) {
        "Summer"
    } else if (month in 8..11) {
        "Autumn"
    } else {
        "Invalid format"
    }
}

fun ageOfThePet(age: Int): Number {
    return if (age <= 2) {
        age * 10.5
    } else {
        (2 * 10.5) + ((age - 2) * 4)
    }
}

fun transport (distance: Int): Any {
    return  if (distance in 0 .. 1) {"on foot"}
            else if (distance in 2 .. 5) {"bicycle"}
            else {"motor transport"}
    }

fun bonusRubles(theAmount: Int): Int {
    return if (theAmount in 0..1000) {
        (theAmount / 100) * 2
    } else if (theAmount in 1001..10000) {
        20 + ((theAmount - 1000) / 100) * 5
    } else {
        0
    }
}


