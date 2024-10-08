package com.example.kotlin.flow.non_terminal_operators.transform

import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        flowOf(20, 2, 30, 4, 50, 6)
            .filter { it > 10 }
            .onEach { println(it) }
            .launchIn(this)
    }
}