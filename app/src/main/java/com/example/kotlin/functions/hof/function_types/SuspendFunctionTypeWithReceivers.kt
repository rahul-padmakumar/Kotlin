package com.example.kotlin.functions.hof.function_types

import kotlinx.coroutines.delay

suspend fun main(){

    val sum: suspend Int.(Int) -> Int = { b ->
        delay(1000)
        this + b
    }
    println("Start")
    println(1.sum(6))
    println(sum(1, 7))
}