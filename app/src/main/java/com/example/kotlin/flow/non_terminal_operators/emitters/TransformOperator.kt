package com.example.kotlin.flow.non_terminal_operators.emitters

import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.transform
import kotlinx.coroutines.runBlocking

fun main(){
    println("Programme start")
    runBlocking {
        flowOf(1, 2, 3, 4, 5, 6)
            .transform {
                emit(it * it)
                emit(it * 10)
            }.onEach {
                println(it)
            }.launchIn(this)
    }
}