package com.example.kotlin.flow.channels

import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * Useful when handling expensive resources. So when some error handles we can close the emitted resource.
 */

fun main(){
    runBlocking {
        val channel = Channel<Int>(onBufferOverflow = BufferOverflow.DROP_OLDEST){
            println("Undelivered element: $it")
        }
        launch {
            repeat(10){
                delay(1000)
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
        delay(4000)
        channel.close()
    }
}