package com.example.kotlin.basics.conditional_operators.if_basics

fun main(){
    println("Enter a number")
    val number = readlnOrNull()?.toIntOrNull()
    number?.let {
        val isDivisibleBy5 = if(it % 5 == 0) "" else "not "
        println("$it is ${isDivisibleBy5}divisible by 5")
    }
}