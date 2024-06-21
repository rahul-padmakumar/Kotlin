package com.example.kotlin.basics.conditional_operators.when_basics

fun main(){

    println("Enter month number")
    val monthNUmber = readlnOrNull()?.toIntOrNull()
    monthNUmber?.let {
        when(it){
            1 -> println("January")
            2 -> println("February")
            3 -> println("March")
            4 -> println("April")
            5 -> println("May")
            6 -> println("June")
            7 -> println("July")
            8 -> println("August")
            9 -> println("September")
            10 -> println("October")
            11 -> println("November")
            12 -> println("December")
            else -> println("invalid month number")
        }
    }
}