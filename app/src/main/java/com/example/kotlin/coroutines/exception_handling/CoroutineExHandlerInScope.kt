package com.example.kotlin.coroutines.exception_handling

import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import java.lang.RuntimeException

fun main(){
    val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
        println("Exception - ${throwable.message}")
    }
    val scope = CoroutineScope(Job() + exceptionHandler)
    scope.launch {
        launch {
            throw RuntimeException("Coroutine Failed")
        }
    }
    Thread.sleep(1000L)
}