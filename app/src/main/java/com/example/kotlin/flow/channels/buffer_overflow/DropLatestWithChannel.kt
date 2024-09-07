package com.example.kotlin.flow.channels.buffer_overflow

import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        val channel = Channel<Int>(onBufferOverflow = BufferOverflow.DROP_LATEST)
        launch {
            repeat(10){
                delay(100)
                println("Emit $it")
                channel.send(it)
            }
        }
        launch {
            channel.consumeEach{
                println("Collect $it")
                delay(5000)
            }
        }
    }
}