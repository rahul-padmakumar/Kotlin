package com.example.kotlin.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

fun main(){
    runBlocking {
        println("program starts")
        repeat(1_000_000){
            launch{
                threadRoutine(it)
            }
        }
        println("Program stops")
    }
}

private suspend fun threadRoutine(threadIndex: Int){
    println("Started thread $threadIndex on: ${Thread.currentThread().name}")
    delay(5000)
    println("Ended thread $threadIndex")
}