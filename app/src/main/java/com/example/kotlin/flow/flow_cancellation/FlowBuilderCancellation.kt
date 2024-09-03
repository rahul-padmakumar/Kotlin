package com.example.kotlin.flow.flow_cancellation

import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.runBlocking

fun main(){
    val flow = flow {
        emit(1)
        emit(2)
        emit(3)
    }

    runBlocking {
        flow.onCompletion {
            if(it is CancellationException){
                println("Flow cancelled")
            }
        }.collect{
            println(it)
            if(it == 2){
                cancel()
            }
        }
    }
}