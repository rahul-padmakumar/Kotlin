package com.example.kotlin.coroutines.exception_handling.trycatch_vs_exhandler

import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main(){

    val scope = CoroutineScope(Job())
    val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
        println("Exception occurred: ${throwable.message}")
    }

    scope.launch(exceptionHandler) {
        launch {
            println("Coroutine 1 started")
            delay(1000)
            throw RuntimeException("Test")
        }

        launch {
            println("Coroutine 2 started")
            delay(2000)
            println("Coroutine 2 ended")
        }
    }
    Thread.sleep(4000)
}