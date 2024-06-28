package com.example.kotlin.functions.hof.function_types

import kotlinx.coroutines.delay

suspend fun main(){

    val sum: suspend (Int, Int) -> Int = {a, b ->
        delay(1000)
        a + b
    }
    println("start")
    println(sum.invoke(6, 7))
    println(sum(6, 7))
}