package com.example.kotlin.flow.hot_flow.features

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.launch

/**
 * In case of cold flow collection and emission happens in same coroutine, so on
 * cancelling collection coroutine emission also gets cancelled.
 *
 * In case of hot flow collection and emission happens in separate coroutine, so
 * cancelling collection coroutine has no effect on emission coroutine.
 */
fun main(){
    val scope = CoroutineScope(Job())
    val sharedFlow = MutableSharedFlow<Int>()

    scope.launch {
        repeat(10){
            delay(it * 100L)
            println("Emit: $it")
            sharedFlow.emit(it)
        }
    }

    val job = scope.launch{
        sharedFlow.collect{
            println("Collector 1: $it")
        }
    }
    Thread.sleep(1000)
    job.cancel()
    Thread.sleep(4000)
}