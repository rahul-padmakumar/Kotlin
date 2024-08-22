package com.example.kotlin.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull

fun main(){
    runBlocking {
        val a = withTimeoutOrNull(4_000){
            delay(2000)
            3
        }
        val b = withTimeoutOrNull(5_000){
            delay(6000)
            5
        }
        println("Value of a = $a and value of b = $b")
    }
}