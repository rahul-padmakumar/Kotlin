package com.example.kotlin.flow.buffer

import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.buffer
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){

    runBlocking {
        val flow = flow {
            repeat(5){
                println("Emitter: Starting processing - $it")
                delay(100)
                println("Emitter: Processed item - $it")
                emit(it)
            }
        }.buffer(capacity = 1, onBufferOverflow = BufferOverflow.DROP_LATEST)
        launch {
            flow.collect{
                println("Collector: Start collecting item - $it")
                delay(5000)
                println("Collector: Stops collecting item - $it")
            }
        }
    }
}