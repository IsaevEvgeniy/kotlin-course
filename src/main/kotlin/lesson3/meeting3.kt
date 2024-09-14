package com.isaev.lesson3

import javax.sound.sampled.DataLine.Info
import javax.swing.UIDefaults.LazyInputMap

val name: String = "Evgeniy" // неизменяемая переменная

var age: Int = 33 // изменяемая переменная

const val PI = 3.14 // константа (глобальная переменная)

lateinit var userInfo: String // поздняя инициализация

val lazyString: String by lazy {
    "hello, this is a lazy string"
} // отложенная инициализация

var speed: Double? = null // ? - эта переменная может быть null

var const: Int = 0
    get() = field
    set(value) {
        if (value >=0) field = value
    } // переменная с заданными значениями
