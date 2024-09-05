package com.example.kotlin.flow.hot_flow.state_flow

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

fun main(){

    val coldFlow = flow {
        repeat(100){
            delay(100)
            println("Emit $it")
            emit(it)
        }
    }

    val scope = CoroutineScope(Job())
    val stateFlow = coldFlow.stateIn(
        scope,
        SharingStarted.WhileSubscribed(2000),
        -1
    )

    val job = scope.launch {
        delay(1000)
        stateFlow.collect{
            println("Collected - $it")
        }
    }

    Thread.sleep(2000)
    job.cancel()

    Thread.sleep(1000)

    val job1 = scope.launch {
        stateFlow.collect{
            println("Collected 1 - $it")
        }
    }

    Thread.sleep(1000)
    job1.cancel()

    Thread.sleep(6000)
}