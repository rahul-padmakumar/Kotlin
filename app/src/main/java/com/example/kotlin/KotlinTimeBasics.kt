package com.example.kotlin

import kotlin.time.Duration.Companion.days
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.DurationUnit

fun main(){

    val t1 = 500.milliseconds
    println(t1)
    val t2 = t1.inWholeSeconds
    println(t2)
    val t3 = 1.days
    println(t3.toString(DurationUnit.HOURS))
    println(t3.toString(DurationUnit.MINUTES))
    println(t3.toString(DurationUnit.SECONDS))
    println(5087.milliseconds.toString(DurationUnit.SECONDS, 4))
    println(5087.milliseconds.toString(DurationUnit.SECONDS, 2))

}