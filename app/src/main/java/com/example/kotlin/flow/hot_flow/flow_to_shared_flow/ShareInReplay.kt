package com.example.kotlin.flow.hot_flow.flow_to_shared_flow

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.shareIn
import kotlinx.coroutines.launch

fun main(){

    val coldFlow = flow {
        delay(250)
        println("Emit 1")
        emit(1)
        delay(250)
        println("Emit 2")
        emit(2)
        delay(250)
        println("Emit 3")
        emit(3)
        delay(250)
        println("Emit 4")
        emit(4)
        delay(250)
        println("Emit 5")
        emit(5)
        delay(250)
        println("Emit 6")
        emit(6)
        delay(250)
        println("Emit 7")
        emit(7)
        delay(250)
        println("Emit 8")
        emit(8)
        delay(250)
        println("Emit 9")
        emit(9)
        delay(250)
        println("Emit 10")
        emit(10)
    }

    val scope = CoroutineScope(Job())
    val sharedFlow = coldFlow.shareIn(
        scope,
        SharingStarted.WhileSubscribed(2000),
        replay = 1
    )

    val job = scope.launch {
        delay(1000)
        sharedFlow.collect{
            println("Collected - $it")
        }
    }

    Thread.sleep(2000)
    job.cancel()

    Thread.sleep(8000)

    scope.launch {
        sharedFlow.collect{
            println("Collected 1 - $it")
        }
    }

    Thread.sleep(2000)
}