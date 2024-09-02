package com.example.kotlin.coroutines.exception_handling.scope

import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.supervisorScope

fun main(){
    val exHandler = CoroutineExceptionHandler { _, throwable ->
        println("Exception occurred: ${throwable.message}")
    }
    val scope = CoroutineScope(Job())
    scope.launch {
        try {
            supervisorScope{
                launch(exHandler){
                    throw RuntimeException("Testing")
                }
            }
        } catch (e: Exception){
            println("Exception: ${e.message}")
        }
    }
    Thread.sleep(1000)
}