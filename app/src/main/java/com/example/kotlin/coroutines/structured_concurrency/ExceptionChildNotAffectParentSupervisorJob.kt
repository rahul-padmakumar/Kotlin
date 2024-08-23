package com.example.kotlin.coroutines.structured_concurrency

import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.coroutines.cancellation.CancellationException

fun main(){
    val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
        println(throwable.message)
    }
    val parentJob = SupervisorJob()
    val scope = CoroutineScope(parentJob + exceptionHandler)

    scope.launch {
        // below two uses normal job from this scope
        launch {
            delay(1000)
            throw RuntimeException("First coroutine Exception")
        }
        launch {
            delay(2000)
            println("Coroutine 3 completes")
        }.invokeOnCompletion {
            if(it is CancellationException){
                println("Coroutine 3 cancelled")
            }
        }
    }

    scope.launch {
        delay(2000)
        println("Coroutine 2 completes")
    }.invokeOnCompletion {
        if(it is CancellationException){
            println("Coroutine 2 cancelled")
        }
    }
    Thread.sleep(3000)
}