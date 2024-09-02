package com.example.kotlin.coroutines.exception_handling.scope

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.supervisorScope

/**
 * Exception occurs since supervisor scope starts a new coroutine scope and we need to handle exception ourselves.
 */

fun main(){
    val scope = CoroutineScope(Job())
    scope.launch {
        try {
            supervisorScope {
                launch {
                    throw RuntimeException("Testing")
                }
            }
        } catch (e: Exception){
            println("Exception: ${e.message}")
        }
    }
    Thread.sleep(1000)
}