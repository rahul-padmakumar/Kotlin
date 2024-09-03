package com.example.kotlin.flow.non_terminal_operators.limit

import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.takeWhile
import kotlinx.coroutines.runBlocking

/**
 * Returns a flow that contains first elements satisfying the given predicate.
 */

fun main(){
    runBlocking {
        flowOf(1, 2, 3, 4, 10, 5, 6)
            .takeWhile { it != 10}
            .onEach {
                println(it)
            }.launchIn(this)
    }
}