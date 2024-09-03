package com.example.kotlin.flow.flow_cancellation

import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.cancellable
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.runBlocking
import kotlin.coroutines.cancellation.CancellationException

fun main(){
    runBlocking {
        flowOf(1, 2, 3).onCompletion {
            if(it is CancellationException){
                println("Flow cancelled")
            }
        }.cancellable().collect{
            println(it)
            if(it == 2){
                cancel()
            }
        }
    }
}