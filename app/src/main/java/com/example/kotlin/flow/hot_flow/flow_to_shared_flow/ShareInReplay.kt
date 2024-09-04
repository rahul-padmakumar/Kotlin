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
        repeat(10){
            delay(250)
            println("Emit $it")
            emit(it)
        }
    }

    val scope = CoroutineScope(Job())
    val sharedFlow = coldFlow.shareIn(
        scope,
        SharingStarted.WhileSubscribed(2000),
        replay = 7
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