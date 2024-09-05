package com.example.kotlin.flow.hot_flow.state_flow

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.runBlocking

fun main(){

    val stateFlow = MutableStateFlow(0)
    println(stateFlow.value)
    stateFlow.value = 10
    println(stateFlow.value)

    runBlocking {
        stateFlow.emit(20)
    }

    println(stateFlow.value)
}