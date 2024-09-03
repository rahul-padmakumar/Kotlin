package com.example.kotlin.flow.non_terminal_operators

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.conflate
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        flow{
            for(i in 1..30){
                delay(200)
                emit(i)
            }
        }.conflate().onEach {
            delay(1000)
            println(it)
        }.launchIn(this)
    }
}