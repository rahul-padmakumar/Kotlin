package com.example.kotlin.flow.terminal_operator

import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

/**
 * Flow builder will run on coroutine in which flow collector is called
 * In case of first after receiving first value flow will be cancelled.
 */

fun main(){

    val flow = flow {
        println("Emitting first item")
        kotlinx.coroutines.delay(1000)
        emit(1)
        println("Emitting second item")
        kotlinx.coroutines.delay(1000)
        emit(2)
    }

    val flow2 = flow<Int> {}

    runBlocking {
        println(flow.first())
        println(flow2.firstOrNull())
        println(flow.first { it > 1})
    }
}