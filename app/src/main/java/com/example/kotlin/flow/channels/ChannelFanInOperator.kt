package com.example.kotlin.flow.channels

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){

    runBlocking {
        val channel = Channel<String>()
        launch{
            repeat(5){
                delay(1000)
                channel.send("Launch 1: $it")
            }
        }
        launch {
            repeat(10){
                delay(500)
                channel.send("Launch 2: $it")
            }
        }
        launch {
            channel.consumeEach {
                println(it)
            }
        }
    }
}
