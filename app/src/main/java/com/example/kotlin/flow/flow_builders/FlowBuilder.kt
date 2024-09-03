package com.example.kotlin.flow.flow_builders

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.emitAll
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.runBlocking

fun main(){

    val flow1 = flowOf(1, 2, 3)
    val flow2 = flowOf(4, 5, 6)

    val flow = flow {
        delay(2000)
        emit(1)

        delay(1000)
        flow1.collect{
            emit(it)
        }

        delay(1000)
        emitAll(flow2)
    }

    runBlocking {
        flow.collect{
            println("Flow - $it")
        }
    }
}