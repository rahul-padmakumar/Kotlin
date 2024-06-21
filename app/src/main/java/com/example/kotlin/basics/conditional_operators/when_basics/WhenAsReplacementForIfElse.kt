package com.example.kotlin.basics.conditional_operators.when_basics

fun main(){
    println("Enter the mark")
    readlnOrNull()?.toIntOrNull()?.let { mark ->
        val grade = when{
            mark >= 90 -> "A+"
            mark >= 80 -> "A"
            mark >= 70 -> "B"
            mark >= 60 -> "C"
            mark >= 50 -> "D"
            mark >= 40 -> "E"
            else -> "F"
        }
        println("Your grade is $grade")
    }
}