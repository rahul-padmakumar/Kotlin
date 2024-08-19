package com.example.kotlin.threads

import kotlin.concurrent.thread

fun main(){
    println("program starts")
    repeat(1_000_000){
        threadRoutine(it)
    }
    println("Program stops")
}

private fun threadRoutine(threadIndex: Int){
    thread {
        println("Started thread $threadIndex on: ${Thread.currentThread().name}")
        Thread.sleep(5000)
        println("Ended thread $threadIndex")
    }
}