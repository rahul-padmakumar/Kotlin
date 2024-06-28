package com.example.kotlin.functions.hof.function_types

fun main(){

    val sum: (Int, Int) -> Int = {a, b -> a + b}
    val b: Int.(Int) -> Int = sum
    println(sum(5, 6))
    println(5.b(6))
    println(b(5, 6))
    //val b1: Int.(Int) -> Int = {a, b -> a + b} only non literal values are interchangeable
    val sum1: Int.(Int) -> Int = {value -> this + value}
    val b2: (Int, Int) -> Int = sum1
    println(5.sum1(7))
    println(b2(6, 7))

}