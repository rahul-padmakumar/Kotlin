package com.example.kotlin.functions.basics

fun main(){
    println("Sum of 1 and 2 is ${sum(1, 2)}")
    println("Sum of 1.5 and 2.5 is ${sum(1.5, 2.5)}")
    println("Double of 2 is ${multiply(2)}")
    println("2 times 4 is ${multiply(4, 2)}")
}

private fun sum(num1: Int, num2: Int): Int = num1 + num2

private fun sum(num1: Double, num2: Double) = num1 + num2

private fun multiply(num1: Int) = num1 * 2

private fun multiply(num1: Int, num2: Int) = num1 * num2
