package com.example.kotlin.flow

import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

@OptIn(FlowPreview::class)
fun main(){

    val flow = flow {
        delay(250)
        println("Emitting one")
        emit(1)
        delay(250)
        println("Emitting two")
        emit(2)
        delay(250)
        println("Emitting three")
        emit(3)
        delay(250)
        println("Emitting four")
        emit(4)
        delay(250)
        println("Emitting five")
        emit(5)
        delay(250)
        println("Emitting six")
        emit(6)
        delay(250)
        println("Emitting seven")
        emit(7)
    }

    runBlocking {
        flow.debounce(1000)
            .collect{
                println("Collected value : $it")
            }
    }
}