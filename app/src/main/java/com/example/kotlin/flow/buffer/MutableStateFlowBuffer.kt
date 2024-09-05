package com.example.kotlin.flow.buffer

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

/**
 * Mutable state flow has replay as 1 and buffer overflow as Drop Oldest
 */

suspend fun main(): Unit = coroutineScope {

    val stateFlow = MutableStateFlow(-1)

    launch {
        stateFlow.collect{
            println("Collector 1: $it")
        }
    }

    launch {
        stateFlow.collect{
            println("Collector 2: $it")
            delay(100)
        }
    }

    launch {
        repeat(10){
            delay(50)
            println("Emitting - $it")
            stateFlow.emit(it)
        }
    }
}