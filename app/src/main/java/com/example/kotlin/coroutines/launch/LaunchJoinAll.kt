package com.example.kotlin.coroutines.launch

import com.example.kotlin.coroutines.calculateDuration
import kotlinx.coroutines.delay
import kotlinx.coroutines.joinAll
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        val startTime = System.currentTimeMillis()
        val job1 = launch {
            println("First coroutine started at ${calculateDuration(startTime)}")
            delay(600)
            println("First coroutine ended at ${calculateDuration(startTime)}")
        }
        val job2 = launch {
            println("Second coroutine started at ${calculateDuration(startTime)}")
            delay(600)
            println("Second coroutine ended at ${calculateDuration(startTime)}")
        }
        joinAll(job1, job2)
        println("Program ended")
    }
}