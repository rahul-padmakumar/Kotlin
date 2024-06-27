package com.example.kotlin.functions.tail_recursive


/**
 * Compiler replaces recursion with iteration if tail rec keyword is added
 * also last statement in the function should be call to function itself
 */
fun main(){
    println(factorial(5))
}

private tailrec fun factorial(number: Int, accumulator: Int = 1): Int =
    if(number == 1) accumulator else factorial(number - 1, number * accumulator)