package com.example.kotlin.flow.terminal_operator

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.single
import kotlinx.coroutines.runBlocking

fun main(){
    val flow = flow {
        println("Emitting first item")
        delay(1000)
        emit(1)
    }

    runBlocking {
        println(flow.single())
    }
}