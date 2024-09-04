package com.example.kotlin.flow.hot_flow.features

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.launch

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

    scope.launch{
        sharedFlow.collect{
            println("Collector 1: $it")
        }
    }
    scope.launch {
        sharedFlow.collect {
            println("Collector 2: $it")
        }
    }
    Thread.sleep(5000)
}