package com.example.kotlin.flow.channels

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * Produce function returns ReceiveChannel which can only used for reading values
 * from the channel.
 * Using produce function we dont need to call channel.close explicitly.
 */
@OptIn(ExperimentalCoroutinesApi::class)
fun main(){
    runBlocking {
        var channel: ReceiveChannel<Int> = Channel()
        launch {
            channel = produce<Int> {
                delay(100)
                println("Emitting from cr: 1 - 1")
                send(1)
                delay(100)
                println("Emitting from cr: 1 - 2")
                send(2)
            }
        }
        launch {
            channel.consumeEach {
                println("Consumed from cr:2 - $it")
            }
        }
    }
}