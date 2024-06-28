package com.example.kotlin.functions.hof.function_types

fun main(){
    val sum: Int.(Int) -> Int = {b -> this + b}
    println(sum(5, 6))
    println(sum.invoke(6, 6))
    println(5.sum(6))
}