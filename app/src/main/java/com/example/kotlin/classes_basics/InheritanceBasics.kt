package com.example.kotlin.classes_basics

private open class CalculatorBase{
    fun add(num1: Int, num2: Int) = num1 + num2
    fun sub(num1: Int, num2: Int) = num1 - num2
    fun multiply(num1: Int, num2: Int) = num1 * num2
    fun div(num1: Int, num2: Int) = num1 / num2
}

private class CalculatorAdvance: CalculatorBase(){
    fun mod(num1: Int, num2: Int) = num1 % num2

    fun sqrt(num: Int) = kotlin.math.sqrt(num.toFloat())
}

fun main(){
    val calculator = CalculatorAdvance()
    println(calculator.add(1, 2))
    println(calculator.multiply(3, 10))
    println(calculator.sub(10, 4))
    println(calculator.div(10, 2))
    println(calculator.mod(14, 10))
    println(calculator.sqrt(25))
}