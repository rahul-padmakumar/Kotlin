package com.example.kotlin.flow.non_terminal_operators.limit

import kotlinx.coroutines.flow.drop
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.runBlocking

/**
 * Returns a flow that ignores first count elements.
 */
fun main(){
    runBlocking {
        flowOf(1, 2, 3, 4, 5, 6)
            .drop(3)
            .onEach {
                println(it)
            }.launchIn(this)
    }
}