package com.example.kotlin.coroutines.launch

import com.example.kotlin.coroutines.calculateDuration
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        val startTime = System.currentTimeMillis()
        val job1 = launch(start = CoroutineStart.LAZY){
            println("First coroutine started at ${calculateDuration(startTime)}")
            delay(600)
            println("First coroutine ended at ${calculateDuration(startTime)}")
        }
        val job2 = launch(start = CoroutineStart.LAZY){
            println("Second coroutine started at ${calculateDuration(startTime)}")
            delay(600)
            println("Second coroutine ended at ${calculateDuration(startTime)}")
        }

        job1.start()
        delay(500)
        job2.start()

        println("Program ended")
    }
}