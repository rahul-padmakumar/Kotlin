package com.example.kotlin.coroutines.structured_concurrency

import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        this.coroutineContext.get(Job)?.invokeOnCompletion {
            println("Run blocking completes")
        }
        launch {
            delay(1000)
            launch {
               delay(200)
            }.invokeOnCompletion {
                println("launch child completes")
            }
        }.invokeOnCompletion {
            println("launch completes")
        }

        launch (Job()){
            delay(5000)
        }.invokeOnCompletion {
            println("Launch with separate job completes")
        }
    }
}