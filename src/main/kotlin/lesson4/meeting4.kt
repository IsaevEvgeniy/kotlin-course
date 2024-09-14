package com.isaev.lesson4

import javax.sound.midi.MetaMessage

val myInt: Int = 5 // хранит целое число от -2 147 483 648 (-231) до 2 147 483 647 (231 - 1) и занимает 4 байта (Int.MAX_VALUE or MIN_VALUE)
val myFloat: Float = 0.58F // (Float.MAX_VALUE or MIN_VALUE)
val myLong: Long = 123_456L// хранит целое число от –9 223 372 036 854 775 808 (-263) до 9 223 372 036 854 775 807 (263-1) и занимает 8 байт (Long.MAX_VALUE or MIN_VALUE)
val myShort: Short = 32000 // хранит целое число от -128 до 127 и занимает 1 байт (Short.MAX_VALUE or MIN_VALUE)
val myByte: Byte = 120 // хранит целое число от -128 до 127 и занимает 1 байт (Byte.MAX_VALUE or MIN_VALUE)
val myDouble: Double = 5.99 // (Dooble.MAX_VALUE or MIN_VALUE)
val isKotlinFunction: Boolean = true
val letter: Char = '&' // возвращает экземпляр
val text: String = ""

val numbers: Array<Int> = arrayOf(1, 2, 3)
val strings: MutableList<String> = mutableListOf("one", "two", "one")
val doubles: Set<Double> = setOf(23.3, 56,8)

val keysToValues: Map<String, String> = mapOf(
    "ключ1" to "значение1",
    "ключ2" to "значение2"
)

val anything: Any =  false// означает, что любой объект в Kotlin может быть присвоен переменной типа Any

fun printMassage(message: String): Unit {
    println(message)
}
