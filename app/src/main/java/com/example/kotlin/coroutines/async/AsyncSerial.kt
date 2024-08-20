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
            println("Coroutine 1 started at ${calculateDuration(startTime)}")
            delay(500)
            println("Coroutine 1 ended at ${calculateDuration(startTime)}")
            5
        }
        val num1 = def1.await()
        val def2 = async {
            println("Coroutine 2 started at ${calculateDuration(startTime)}")
            delay(500)
            println("Coroutine 2 ended at ${calculateDuration(startTime)}")
            6
        }
        val num2 = def2.await()
        println("Sum is : ${num1 + num2}")
        println("Program ended")
    }
}