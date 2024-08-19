package com.example.kotlin.threads

import kotlin.concurrent.thread

private fun threadRoutine(threadIndex: Int) = thread {
    println("Started thread $threadIndex on: ${Thread.currentThread().name}")
    Thread.sleep(5000)
    println("Ended thread $threadIndex")
}

fun main(){
    println("program starts")
    threadRoutine(1).join() // main thread will get blocked for thread 1 to finish
    threadRoutine(2).join() // main thread will get blocked for thread 2 to finish
    println("Program stops")
}