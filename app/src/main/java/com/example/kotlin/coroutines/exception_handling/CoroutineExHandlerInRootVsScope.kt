package com.example.kotlin.coroutines.exception_handling

import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import java.lang.RuntimeException

/**
 * Handler passed to root have priority over handler passed to scope
 */

fun main(){
    val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
        println("Exception - ${throwable.message}")
    }
    val exceptionHandler1 = CoroutineExceptionHandler{ _, throwable ->
        println("Exception 1 - ${throwable.message}")
    }
    val scope = CoroutineScope(Job() + exceptionHandler)
    scope.launch (exceptionHandler1){
        launch {
            throw RuntimeException("Coroutine Failed")
        }
    }
    Thread.sleep(1000L)
}