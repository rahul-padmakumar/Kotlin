package com.example.kotlin.coroutines.cancelling_coroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.ensureActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){

    println("Programme: Starting")
    runBlocking {
        val job = launch(Dispatchers.Default) {
            repeat(10){
                ensureActive()
                Thread.sleep(it * 1000L)
                println("Coroutine - $it")
            }
        }
        job.invokeOnCompletion {
            println("scope cancelled")
        }
        delay(3000L)
        println("Cancelling coroutine")
        job.cancel()
    }
}