package com.example.kotlin.flow.flow_builders

import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.runBlocking

fun main(){

    val flow1 = flowOf(1)
    val flow2 = flowOf(1, 2, 3, 4, 5)
    val flow3 = flowOf(listOf(5, 6, 7))

    runBlocking {
        flow1.collect{
            println("Flow1: $it")
        }
        flow2.collectLatest {
            println("Flow2: $it")
        }
        flow3.collect{
            println("Flow3: $it")
        }
    }
}