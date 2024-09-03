package com.example.kotlin.flow.non_terminal_operators.emitters

import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.onEmpty
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        flowOf<Int>().onEmpty {
            emit(10)
        }.onEach {
            println(it)
        }.launchIn(this)
    }
}