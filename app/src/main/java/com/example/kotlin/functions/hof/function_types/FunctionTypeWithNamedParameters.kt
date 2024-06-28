package com.example.kotlin.functions.hof.function_types

fun main(){

    val sum: (a: Int, b: Int) -> Int = {a, b -> a + b}
    println(sum(5, 8))
    println(sum(9, 9))
}