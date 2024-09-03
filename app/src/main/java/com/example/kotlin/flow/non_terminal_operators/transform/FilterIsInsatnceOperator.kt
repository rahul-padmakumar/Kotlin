package com.example.kotlin.flow.non_terminal_operators.transform

import kotlinx.coroutines.flow.filterIsInstance
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        flowOf(1, "A", "B", 2, "C", 3)
            .filterIsInstance<String>()
            .onEach { println(it) }
            .launchIn(this)
    }
}