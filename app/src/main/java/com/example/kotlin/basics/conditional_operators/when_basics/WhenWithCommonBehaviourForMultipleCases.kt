package com.example.kotlin.basics.conditional_operators.when_basics

fun main(){
    println("Enter month name")
    val monthName = readlnOrNull()
    monthName?.let {
        val days = when(it.lowercase()){
            "january", "march", "may", "july", "august", "october", "december" -> 31
            "february" -> 28
            "april", "june", "september", "november" -> 30
            else -> 0
        }
        if(days != 0) {
            println("$it has $days days")
        } else {
            println("$it is invalid month")
        }
    }
}