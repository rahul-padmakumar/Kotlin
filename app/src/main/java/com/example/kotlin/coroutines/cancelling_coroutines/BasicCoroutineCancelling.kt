package com.example.kotlin.coroutines.cancelling_coroutines

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){

    println("Programme: Starting")
    runBlocking {
        val job = CoroutineScope(Job()).launch {
            repeat(10){
                delay(it * 1000L)
                println("Coroutine - $it")
            }
        }
        job.invokeOnCompletion {
            println("scope cancelled")
        }
        delay(3000L)
        job.cancel()
    }
}