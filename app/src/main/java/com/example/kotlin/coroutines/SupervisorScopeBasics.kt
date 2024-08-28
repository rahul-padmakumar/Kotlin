package com.example.kotlin.coroutines

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.supervisorScope

/**
 * Used for concurrent decomposition of work
 * or
 * for launching coroutines from suspend functions
 *
 * supervisorScope prevents cancellation of sibling if one of the child fails
 */
fun main(){
    val scope = CoroutineScope(Job())

    scope.launch {
        supervisorScope {
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
        //doSomethingNormalScope()
        launch {
            println("Starting 3")
            delay(300)
            println("3 ended")
        }
    }
    Thread.sleep(1000)
}

private suspend fun doSomething() = supervisorScope {
    launch {
        println("Starting 4")
        delay(100)
        throw RuntimeException("Test")
    }
    launch {
        println("Starting 5")
        delay(200)
        println("5 ended")
    }
}

private suspend fun doSomethingNormalScope() = coroutineScope {
    launch {
        println("Starting 4")
        delay(100)
        throw RuntimeException("Test")
    }
    launch {
        println("Starting 5")
        delay(200)
        println("5 ended")
    }
}