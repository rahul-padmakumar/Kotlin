package com.example.kotlin.flow.hot_flow.features

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        val sharedFlow = MutableSharedFlow<Int>()
        repeat(10){
            delay(it * 100L)
            println("Emit: $it")
            sharedFlow.emit(it)
        }
    }
}