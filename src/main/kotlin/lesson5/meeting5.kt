package com.isaev.lesson5

fun main () {

    //операторы
    val sum = 10 + 5 // конкатинация "5" + "3" = 53
    val diff = 10 - 5
    val product = 10 * 5
    val quotient = 10 / 5
    val remainder = 10 % 5 // вычисление остатка при делении

    //операторы сравнения
    val isEquel = (5 == 4)
    val isNotEquel = (5 != 4)
    val isGreater = (5 > 3)
    val isLasser = (5 < 3)
    val isGreaterOrEqual = (5 >= 5)
    val isLesserOrEqual = (5 <= 3)
    val andResult = (5 > 3) && (5 > 4) // true и true
    val orResult = (5 > 3)  (5 < 4) // true или false
    val notResult = !(5 > 3) // false

    //операторы присваивания
    var number = 5
    number += 3
    number -= 2
    number /= 1
    number *= 4

    // операторы инкрименты и диклемента
    number++ //инкримент
    number-- //диклемента

    // приоритеты
    ((8 + 1) >= 9)  (6 - 2 != 4) && (2 * 3 == 6) // true  false && true = true
    (3 + 2 < 6) && (4 * 2 == 8) // true && true = true
    (10 - 5 >= 5)  (2 * 3 != 6) // true  false = true
    (8 / 2 == 4) && (7 % 3 != 1) // true && false = false
    (9 - 3 >= 6) && (8 / 2 != 4) // true && false = false
    ((3 + 4) < 8) && (12 / 3 == 4)  (5 % 2 != 1) // true && true  false = true
    ((10 - 5) >= 5)  (6 * 2 != 12) && !(9 / 3 > 2) // true  false && false = true
    ((2 * 5) == 10) && !(7 - 3 < 5)  (8 / 2 == 4) // true && false  true = true
    ((9 + 2) < 12) && (15 % 4 != 3)  !(4 * 2 == 8) // true && false  false = false

    ((
    var a = 4; a-- == 4)  (5 * 2 != 10)) && (3+1 == 4) // true  false && true = true
    (
    var b = 3; b++ > 3) && (6 / 2 == 3)  (7-2 != 5) // false && true  false = false
    (
    var c = 1; ++c < 3)  ((4 % 2 == 0) && (5+0 == 5)) // true  true && true = true
    ((
    var d = 5; d-- == 5) && (8 / 4 == 2))  (2 * 3 != 6) // true && true  false = true
    (
    var e = 2; e++ < 3) && ((7+1 == 8)  (4 % 2 != 0)) // true && true || false = true

    println()
}

// оператор элвиса
var name: String? = null


val res = if (name == null) {
    "Unknown"
} else {
    name
}

val defauldName = "Unknown"
val result = name ?: "Unknown"
val result = если null то выполнить: throw Exception ("не может быть null")
}


fun main () {
    printVolume ( null)
}

fun printVolume(userVolume: Int?) {
    val defaultVolume = 30
    println(userVolume ?: defaultVolume)
}


fun main () {
    printPrice( 123.0, null )
    printPrice( 455.5, 125 )

}

fun printPrice(price: Double, s: Int?){
    val koef = (100 - (s ?: 0))/ 100.0
    println(price * koef)
}

fun main () {
    printLanguage("Rus")
    printLanguage(null)
}

fun printLanguage(lang: String?){
    val defaultLang: String = "Eng"
    println(lang ?: defaultLang)
}

fun main () {
    printBoxStuff(null)
    printBoxStuff("hi")
}

fun printBoxStuff (stuff: String) {
    println(stuff ?: throw Exception("Box is empty"))
}
