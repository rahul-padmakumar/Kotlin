package com.example.kotlin.coroutines.structured_concurrency

import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        val parentJob = Job()
        val scope = CoroutineScope(parentJob)
        scope.launch {
            delay(2000)
        }.invokeOnCompletion {
            if(it is CancellationException){
                println("First child cancelled")
            }
        }
        scope.launch {
            delay(1500)
        }.invokeOnCompletion {
            if(it is CancellationException){
                println("Second child cancelled")
            }
        }
        delay(500)
        //scope.cancel()
        //parentJob.cancel()
        parentJob.cancelAndJoin()
    }
}