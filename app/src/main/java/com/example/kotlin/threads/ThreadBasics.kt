package com.example.kotlin.threads

import kotlin.concurrent.thread

fun main(){
    println("program starts")
    threadRoutine(1)
    threadRoutine(2)
    println("Program stops")
}

private fun threadRoutine(threadIndex: Int){
    thread {
        println("Started thread $threadIndex on: ${Thread.currentThread().name}")
        Thread.sleep(5000)
        println("Ended thread $threadIndex")
    }
}