package com.example.kotlin.flow.non_terminal_operators.transform

import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        flowOf(null, "A", "B", null, "C", null)
            .filterNotNull()
            .onEach { println(it) }
            .launchIn(this)
    }
}