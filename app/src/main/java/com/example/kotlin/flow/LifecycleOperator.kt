package com.example.kotlin.flow

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.onStart

fun main(){

    val flow = flow {

        kotlinx.coroutines.delay(1000)
        println("Emitting one")
        emit(1)

        kotlinx.coroutines.delay(1000)
        println("Emitting two")
        emit(2)
    }

    flow
        .onStart {
            println("Flow started")
            emit(-1)
        }
        .onCompletion {
            println("Flow completion")
            emit(-2)
        }
        .onEach {
            println("Flow onEach - $it")
        }
        .onStart {
            println("Flow started 1")
            emit(-3)
        }
        .launchIn(CoroutineScope(Job()))

    Thread.sleep(3000)
}