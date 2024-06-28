package com.example.kotlin.functions.hof.function_types

fun main(){

    val sum: ((Int, Int) -> Int)?
    sum = {a, b -> a + b}
    println(sum(8, 9))
}