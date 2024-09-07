package com.example.kotlin.flow

import kotlinx.coroutines.flow.channelFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
/*
 * Channel flow is used for handling concurrent asynchronous data streams
 *
 */

fun main(){

    val flow = channelFlow{
        launch {
            kotlinx.coroutines.delay(1000)
            send(10)
        }
        launch {
            kotlinx.coroutines.delay(2000)
            send(20)
        }
    }

    runBlocking {
        flow.collect{
            println("Collected: $it")
        }
    }
}