package com.example.kotlin.classes_basics

fun main(){
    val calculator = Calculator()
    println(calculator.add(1, 2))
    println(calculator.multiply(3, 10))
    println(calculator.sub(10, 4))
    println(calculator.div(10, 2))
}

private class Calculator{
    fun add(num1: Int, num2: Int) = num1 + num2
    fun sub(num1: Int, num2: Int) = num1 - num2
    fun multiply(num1: Int, num2: Int) = num1 * num2
    fun div(num1: Int, num2: Int) = num1 / num2
}