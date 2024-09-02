package com.example.kotlin.coroutines.exception_handling.launch_vs_async

import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.async
import kotlinx.coroutines.delay

fun main(){
    val exceptionHandler = CoroutineExceptionHandler{_, throwable ->
        println("Exception caught: $throwable")
    }

    val scope = CoroutineScope(Job())
    scope.async (exceptionHandler) {
        delay(200)
        throw RuntimeException("Testing")
    }
    Thread.sleep(1000)
}