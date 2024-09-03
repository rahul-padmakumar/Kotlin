package com.example.kotlin.flow.non_terminal_operators.distinct

import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        flowOf(1, 1, 2, 2, 3, 3, 3, 4, 4, 3)
            .distinctUntilChanged()
            .onEach { println(it) }
            .launchIn(this)
    }
}