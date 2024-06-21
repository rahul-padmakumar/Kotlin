package com.example.kotlin.basics.conditional_operators.when_basics

fun main(){
    println("Time of day in 24 hrs")
    val time = readlnOrNull()?.toIntOrNull()
    time?.let {
        when(it){
            in 1..11 -> println("Good Morning")
            in 12..15 -> println("Good Afternoon")
            in 16..19 -> println("Good Evening")
            in 20 .. 24 -> println("Good night")
            !in 1..24 -> println("Invalid time")
        }
    }
}