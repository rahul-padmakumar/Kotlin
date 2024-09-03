package com.example.kotlin.flow.non_terminal_operators.zip

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.combineTransform
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        flowOf(1, 2).onEach { delay(400) }
            .combineTransform(
                flowOf("A", "B", "C").onEach { delay(300) }
            ){v1, v2 ->
                emit("Processing in progress")
                emit("$v1$v2")
            }.onEach {
                println(it)
            }.launchIn(this)
    }
}