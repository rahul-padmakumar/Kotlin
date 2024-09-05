package com.example.kotlin.flow.channels

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        val channel = Channel<Int>()
        launch {
            delay(100)
            println("Emitting from cr: 1 - 1")
            channel.send(1)
            delay(100)
            println("Emitting from cr: 1 - 2")
            channel.send(2)
            channel.close() //important to close the channel
        }
        launch {
            channel.consumeEach {
                println("Consumed from cr:2 - $it")
            }
        }
    }
}