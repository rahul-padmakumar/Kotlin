package com.example.kotlin.coroutines.launch

import com.example.kotlin.coroutines.calculateDuration
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * Launch will not return result from coroutine. Its behaviour is fire and forget
 */

fun main(){
    runBlocking {
        val startTime = System.currentTimeMillis()
        launch {
            println("First coroutine started at ${calculateDuration(startTime)}")
            delay(600)
            println("First coroutine ended at ${calculateDuration(startTime)}")
        }
        launch {
            println("Second coroutine started at ${calculateDuration(startTime)}")
            delay(600)
            println("Second coroutine ended at ${calculateDuration(startTime)}")
        }
        println("Program ended")
    }
}