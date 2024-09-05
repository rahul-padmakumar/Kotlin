package com.example.kotlin.flow.hot_flow.state_flow

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

suspend fun main(){

    val counter = MutableStateFlow(0)

    coroutineScope {
        repeat(10_000){
            launch {
                counter.value += 1
            }
        }
    }

    println(counter.value)

    counter.value = 0

    coroutineScope {
        repeat(10_000){
            launch {
                counter.emit(counter.value + 1)
            }
        }
    }

    println(counter.value)
}