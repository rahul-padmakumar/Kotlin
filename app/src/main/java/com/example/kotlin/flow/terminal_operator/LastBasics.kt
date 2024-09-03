package com.example.kotlin.flow.terminal_operator

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.last
import kotlinx.coroutines.flow.lastOrNull
import kotlinx.coroutines.runBlocking

fun main(){
    val flow = flow {
        println("Emitting first item")
        delay(1000)
        emit(1)
        println("Emitting second item")
        delay(1000)
        emit(2)
    }

    val flow2 = flow<Int> {}

    runBlocking {
        println(flow.last())
        println(flow2.lastOrNull())
    }
}