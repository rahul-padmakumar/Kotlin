package com.example.kotlin.classes_basics.sealed_classes

/**
 * Enum single instance - sealed class multiple instance possible
 * Enum same property for every instance, sealed class different properties for different sub class.
 */

enum class TimeEnum(val timeUnit: String){
    Day("am"),
    Time("pm")
}

sealed class Time{
    data class Day(val timeUnit: String): Time()
    data object Night: Time()
}

fun main(){
    val day = TimeEnum.Day
    val day1 = TimeEnum.Day
    println("${day1 == day}")
    val day2 = Time.Day("am")
    val day3 = Time.Day("pm")
    println("${day2 == day3}")
}
