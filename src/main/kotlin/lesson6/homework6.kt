package com.isaev.lesson6

fun main () {
    seasonDefinition(15)

}

fun seasonDefinition (month: Int?) {
    return if (month in 1..12) {
        when (month) {
            1, 2, 12 -> println("Winter")
            3, 4, 5 -> println("Spring")
            6, 7, 8 -> println("Summer")
            9, 10, 11 -> println("Autumn")
            else -> println("Invalid format")
        }
    } else {println("Invalid format")}
}
