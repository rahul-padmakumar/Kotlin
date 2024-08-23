package com.example.kotlin.coroutines.structured_concurrency

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.cancel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * Every coroutine needs to be started in a logical scope with limited lifetime.
 */
class Activity{
    private val scope = CoroutineScope(Job())

    fun onDestroy(){
        scope.cancel()
        println("Main scope cancelled")
    }

    fun doSomething(){
        repeat(10){
            scope.launch {
                delay((it + 1) * 200L)
                println("Coroutine $it")
            }
        }
    }
}

fun main(){
    runBlocking {
        val activity = Activity()
        activity.doSomething()
        delay(1000)
        activity.onDestroy()
    }
}