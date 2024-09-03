package com.example.kotlin.flow.non_terminal_operators

import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.mapNotNull
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        flowOf(1, 2, 3, 4, 5, null)
            .mapNotNull {
                it?.times(it)
            }.onEach {
                println(it)
            }.launchIn(this)
    }
}