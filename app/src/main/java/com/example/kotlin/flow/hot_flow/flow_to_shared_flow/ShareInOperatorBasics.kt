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
        repeat(100){
            delay(100)
            println("Emit $it")
            emit(it)
        }
    }

    val scope = CoroutineScope(Job())
    val sharedFlow = coldFlow.shareIn(
        scope,
        SharingStarted.Eagerly
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
}