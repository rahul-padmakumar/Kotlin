package com.example.kotlin.coroutines.exception_handling.trycatch_vs_exhandler

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main(){

    val scope = CoroutineScope(Job())

    scope.launch {
        launch {
            println("Coroutine 1 started")
            delay(1000)
            try {
                throw RuntimeException("Test")
            } catch (e: Exception){
                println("Exception occurred: ${e.message}")
            }
        }

        launch {
            println("Coroutine 2 started")
            delay(2000)
            println("Coroutine 2 ended")
        }
    }
    Thread.sleep(4000)
}