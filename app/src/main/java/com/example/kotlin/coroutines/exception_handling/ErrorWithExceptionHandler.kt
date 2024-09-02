package com.example.kotlin.coroutines.exception_handling

import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

fun main(){
    val scope = CoroutineScope(Job())
    val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
        println("The exception handled: ${throwable.message}")
    }
    scope.launch {
        launch(exceptionHandler) {
            throw RuntimeException()
        }
    }
    Thread.sleep(1000)
}