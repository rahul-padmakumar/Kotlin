package com.example.kotlin.flow.channels.buffering

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

@OptIn(ExperimentalCoroutinesApi::class)
fun main(){
    runBlocking {
        val channel = produce(capacity = Channel.UNLIMITED){
            repeat(10){
                kotlinx.coroutines.delay(100)
                println("Emit $it")
                send(it)
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