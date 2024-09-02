package com.example.kotlin.coroutines.cancelling_coroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.NonCancellable
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import kotlin.coroutines.cancellation.CancellationException

fun main(){

    println("Programme: Starting")
    runBlocking {
        val job = launch(Dispatchers.Default) {
            repeat(10){
                if(isActive) {
                    println("Coroutine - $it")
                    Thread.sleep(1000L)
                } else {
                    withContext(NonCancellable){
                        delay(1000L)
                        println("Cleaning up...")
                        throw CancellationException()
                    }
                }
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