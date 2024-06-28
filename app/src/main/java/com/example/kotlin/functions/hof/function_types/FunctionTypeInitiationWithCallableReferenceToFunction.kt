package com.example.kotlin.functions.hof.function_types

fun main(){
    fun modulo(a: Int, b: Int) = a%b
    var operation: (Int, Int) -> Int = ::sum
    println(operation(3, 4))
    operation = Int::division
    println(operation(10, 2))
    operation = ::modulo
    println(operation(9, 5))
    val arithmeticMultiplication = ArithmeticMultiplication()
    operation = arithmeticMultiplication::multiply
    println(operation(10, 2))
}

private fun sum(a: Int, b: Int) = a + b

class ArithmeticMultiplication{
    fun multiply(a: Int, b: Int) = a * b
}

fun Int.division(b: Int) = this/b

