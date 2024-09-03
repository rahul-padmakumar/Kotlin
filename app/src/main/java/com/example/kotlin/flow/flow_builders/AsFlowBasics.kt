package com.example.kotlin.flow.flow_builders

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.runBlocking

fun main(){

    val flow1 = listOf(1, 2, 3, 4, 5).asFlow()

    runBlocking {
        flow1.collect{
            println("Flow1: $it")
        }
    }
}