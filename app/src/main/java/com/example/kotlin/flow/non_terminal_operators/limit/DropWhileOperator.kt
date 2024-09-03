package com.example.kotlin.flow.non_terminal_operators.limit

import kotlinx.coroutines.flow.dropWhile
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        flowOf(1, 2, 3, 4, 5, 6)
            .dropWhile { it != 4 }
            .onEach {
                println(it)
            }.launchIn(this)
    }
}