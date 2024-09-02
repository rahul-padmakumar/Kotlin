package com.example.kotlin.coroutines.exception_handling

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import java.lang.RuntimeException

fun main(){
    val scope = CoroutineScope(Job())
    scope.launch {
        try {
            launch {
                throw RuntimeException("Coroutine Failed")
            }
        } catch (e: Exception){
            println("Exception occurred: ${e.message}")
        }

    }
    Thread.sleep(1000L)
}