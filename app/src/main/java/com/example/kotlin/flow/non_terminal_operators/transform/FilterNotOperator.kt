package com.example.kotlin.flow.non_terminal_operators.transform

import kotlinx.coroutines.flow.filterNot
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        flowOf(10, 20, 2, 30, 4, 50, 6)
            .filterNot { it > 10 }
            .onEach { println(it) }
            .launchIn(this)
    }
}