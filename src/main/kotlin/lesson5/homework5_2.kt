package com.isaev.lesson5

import java.awt.PrintJob

fun main () {
    println (soundAttenuation(15.0, null))
    println (soundAttenuation(100.0, 50.0))

    println (paymentAmount(null))
    println (paymentAmount(125.0))

    println(meteorologicalMeasurements(null))
    println(meteorologicalMeasurements(500))
}

fun soundAttenuation (soundIintensity: Double, koef: Double?) {
    val attenuationIntensity = (soundIintensity * (koef ?: 0.5))
    println(soundIintensity)
}

fun paymentAmount(cargoCost: Double? = null) {
    val paymentAmount = ((0.5 / 100) * (cargoCost ?: 50.0 )) + (cargoCost ?: 50.0)
    println(paymentAmount)
}

fun meteorologicalMeasurements(atmosphericPressure: Any?) {
    val atmosphericPressure = (atmosphericPressure ?: "ОШИБКА")
    println(atmosphericPressure)}