package com.example.kotlin.coroutines

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * Used for concurrent decomposition of work
 * or
 * for launching coroutines from suspend functions
 */
fun main(){
    val scope = CoroutineScope(Job())

    scope.launch {
        coroutineScope {
            launch {
                println("Starting 1")
                delay(100)
                println("1 ended")
            }
            launch {
                println("Starting 2")
                delay(200)
                println("2 ended")
            }
        }
        doSomething()
        launch {
            println("Starting 3")
            delay(300)
            println("3 ended")
        }
    }
    Thread.sleep(1000)
}

private suspend fun doSomething() = coroutineScope {
    launch {
        println("Starting 4")
        delay(100)
        println("4 ended")
    }
    launch {
        println("Starting 5")
        delay(200)
        println("5 ended")
    }
}