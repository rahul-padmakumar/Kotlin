package com.example.kotlin.functions.hof.function_types

fun main(){

    val a: (Int, Int) -> Int = Sum()
    println(a(2, 3))
    println(a(3, 5))
}

/**
 * Sum is a custom class that implements function type of (Int, Int) -> Int
 */
private class Sum: (Int, Int) -> Int{
    override fun invoke(p1: Int, p2: Int): Int = p1 + p2
}