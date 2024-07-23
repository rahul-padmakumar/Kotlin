package com.example.kotlin.functions.standard_functions

fun main(){
    val numbers = mutableListOf("one", "two", "three")
    numbers.also {
        println("The list element before adding new one : $it")
    }.add("four")

    var num1 = 10
    var num2 = 20

    println("1st number is $num1 and 2nd number is $num2")

    num1 = num2.also {
        num2 = num1
    }

    println("1st number is $num1 and 2nd number is $num2")
}