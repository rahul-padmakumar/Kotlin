package com.example.kotlin.coroutines.async

import com.example.kotlin.coroutines.calculateDuration
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main(){
    val startTime = System.currentTimeMillis()
    println("Program started")
    runBlocking {
        val def1 = async {
            println("Coroutine started at ${calculateDuration(startTime)}")
            delay(500)
            println("Coroutine ended at ${calculateDuration(startTime)}")
            5
        }
        val def2 = async {
            println("Coroutine started at ${calculateDuration(startTime)}")
            delay(500)
            println("Coroutine ended at ${calculateDuration(startTime)}")
            6
        }
        println("Sum is : ${def1.await() + def2.await()}")
        println("Program ended")
    }
}