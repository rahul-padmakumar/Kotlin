package com.example.kotlin.flow.channels

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

@OptIn(ExperimentalCoroutinesApi::class)
fun main(){
    runBlocking {
        val channel1 = produce<Int> {
            repeat(10){
                send(it)
                delay(1000)
            }
        }
        val channel2 = produce {
            repeat(5){
                send("Item - $it")
                delay(2000)
            }
        }
        val mergedChannel = produce {
           launch {
               for(i in channel1){
                   send(i)
               }
           }
            launch {
                for(i in channel2){
                    send(i)
                }
            }
        }
        launch {
            mergedChannel.consumeEach{
                println("Collect item $it")
            }
        }
    }
}