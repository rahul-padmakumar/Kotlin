package com.example.kotlin.coroutines.exception_handling.scope

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.supervisorScope

fun main(){
    val scope = CoroutineScope(Job())
    scope.launch {
        try {
            supervisorScope {
                val deferred = async {
                    throw RuntimeException("Testing")
                }
                launch {
                    deferred.await()
                }
            }
        } catch (e: Exception){
            println("Exception: ${e.message}")
        }
    }
    Thread.sleep(1000)
}