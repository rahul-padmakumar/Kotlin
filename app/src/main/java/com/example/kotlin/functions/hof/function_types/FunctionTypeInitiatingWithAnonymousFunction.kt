package com.example.kotlin.functions.hof.function_types

fun main(){

    val sum: (Int, Int) -> Int = fun(a:Int, b:Int): Int{
        return a+b
    }
    println(sum(3, 4))
    println(sum(10, 5))
}