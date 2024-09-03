package com.example.kotlin.flow.flows_are_cold

import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

/**
 * Only flow2 builder block is executed and first flow flow builder block is not executed
 */

fun main(){

    flow {
        println("Emitting one")
        emit(1)
        println("Emitting two")
        emit(2)
        println("Emitting three")
        emit(3)
    }

    val flow2 = flow{
        println("Emitting four")
        emit(4)
        println("Emitting five")
        emit(5)
        println("Emitting six")
        emit(6)
    }

    runBlocking {
        flow2.collect{
            println("Collect: $it")
        }
    }
}