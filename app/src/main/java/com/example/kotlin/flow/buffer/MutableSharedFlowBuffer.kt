package com.example.kotlin.flow.buffer

import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.launch

/**
 * MutableSharedFlow has extraBufferCapacity and onBufferOverflow to handle buffer overflow scenarios
 */

suspend fun main(): Unit = coroutineScope {

    val sharedFlow = MutableSharedFlow<Int>(
        extraBufferCapacity = 1,
        onBufferOverflow = BufferOverflow.DROP_OLDEST
    )

    launch {
        sharedFlow.collect{
            println("Collector 1: $it")
        }
    }

    launch {
        sharedFlow.collect{
            println("Collector 2: $it")
            delay(100)
        }
    }

    launch {
        repeat(10){
            delay(50)
            println("Emitting - $it")
            sharedFlow.emit(it)
        }
    }
}