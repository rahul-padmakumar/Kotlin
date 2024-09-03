package com.example.kotlin.flow.flows_are_cold

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * Each value will be emitted to individual collectors
 */
fun main(){
    val flow2 = flow{
        println("Emitting four")
        emit(4)
        delay(1000)
        println("Emitting five")
        emit(5)
        delay(2000)
        println("Emitting six")
        emit(6)
    }

    runBlocking {
        launch {
            flow2.collect{
                println("Collect: $it")
            }
        }
        launch {
            flow2.collect{
                println("Collect2: $it")
            }
        }

    }
}