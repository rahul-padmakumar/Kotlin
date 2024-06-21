package com.example.kotlin.basics.conditional_operators.when_basics

/**
 * When used as expression all cases are necessary
 */
fun main(){
    println("Enter month number")
    val monthNUmber = readlnOrNull()?.toIntOrNull()
    monthNUmber?.let {
        val monthName = when(it){
            1 -> "January"
            2 -> "February"
            3 -> "March"
            4 -> "April"
            5 -> "May"
            6 -> "June"
            7 -> "July"
            8 -> "August"
            9 -> "September"
            10 -> "October"
            11 -> "November"
            12 -> "December"
            else -> "Invalid"
        }
        println("$it corresponds to $monthName")
    }
}