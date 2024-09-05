package com.example.kotlin.flow.channels

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * Consume each should not be used in case of fan out (Single producer multiple consumer)
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
            for(value in channel){
                println("Consumed from cr:2 - $value")
            }
        }
        launch {
            for(value in channel){
                println("Consumed from cr:3 - $value")
            }
        }
    }
}