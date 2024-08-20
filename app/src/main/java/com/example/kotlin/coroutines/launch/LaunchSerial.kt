package com.example.kotlin.coroutines.launch

import com.example.kotlin.coroutines.calculateDuration
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        val startTime = System.currentTimeMillis()
        launch {
            println("First coroutine started at ${calculateDuration(startTime)}")
            delay(600)
            println("First coroutine ended at ${calculateDuration(startTime)}")
        }.join()
        launch {
            println("Second coroutine started at ${calculateDuration(startTime)}")
            delay(600)
            println("Second coroutine ended at ${calculateDuration(startTime)}")
        }.join()
        println("Program ended")
    }
}