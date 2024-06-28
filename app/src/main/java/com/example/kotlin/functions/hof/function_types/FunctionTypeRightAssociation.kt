package com.example.kotlin.functions.hof.function_types

fun main(){

    /**
     * sum and sum1 are identical that proves Function types are right associative
     * sum and sum1 represents a concept called currying
     */

    val sum: (Int) -> (Int) -> Unit = {a -> {b -> println(a + b) }}
    sum(1)(5)
    val sum1: (Int) -> ((Int) -> Unit) = {a -> {b -> println( a + b) }}
    sum1(3)(4)
}