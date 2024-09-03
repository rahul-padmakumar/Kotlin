package com.example.kotlin.flow.terminal_operator

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

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
        .onEach {
            println("Flow collection: $it")
        }
        .launchIn(CoroutineScope(Job()))

    Thread.sleep(3000)
}