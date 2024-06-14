package com.example.kotlin.basics.exception_handling

fun main(){
    try {
        println("Enter a number")
        val number = readlnOrNull()
        println(number?.toInt())
    } catch (e: NumberFormatException){
        println(e.message)
    } finally {
        println("Operation completed")
    }
}