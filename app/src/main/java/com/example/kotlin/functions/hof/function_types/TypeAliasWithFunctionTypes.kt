package com.example.kotlin.functions.hof.function_types

typealias SUM = (Int, Int) -> Int

fun main(){
    val sum: SUM = {a, b -> a + b}
    println(sum(6, 5))
}