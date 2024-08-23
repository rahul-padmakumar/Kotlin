package com.example.kotlin.coroutines.structured_concurrency

import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main(){
    val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
        println(throwable.message)
    }
    val scope = CoroutineScope(Job() + exceptionHandler)

    scope.launch {
        launch{
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