package com.example.kotlin.coroutines

import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * Global scope lifetime is entire lifetime of application
 * Does not inherit job so does not follow structured concurrency
 * Coroutines launched in Global scope are like daemon threads
 * Exception on one sibling will not affect other siblings
 * Global scope and children coroutines launched in GlobalScope cannot be cancelled
 */

@OptIn(DelicateCoroutinesApi::class)
fun main(){

    val job = GlobalScope.launch {
        println("Job passed to child is: ${this.coroutineContext[Job]}")
        launch {
            delay(100)
            println("Child coroutine")
            throw RuntimeException()
        }.invokeOnCompletion {
            println("Child coroutine completed")
        }
        launch {
            delay(700)
            println("Child coroutine")
        }.invokeOnCompletion {
            println("Child coroutine completed")
        }
    }.invokeOnCompletion {
        println("Global scope completed")
    }

    println("Job of global scope launch is: $job")
    Thread.sleep(5000)
    println("Program ends")
}