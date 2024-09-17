package com.example.kotlin.flow

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun fetchData(callback: (Int) -> Unit){
    CoroutineScope(Job()).launch {
        repeat(10){
            delay(1000)
            callback(it)
        }
    }
}

fun main(){
    runBlocking {
        val callbackFlow = callbackFlow<Int>{
            fetchData {
                trySend(it)
            }
            awaitClose {
                // will be called only if collector is cancelled
                println("Unregister callbacks here")
            }
        }

        val job = launch {
            callbackFlow.collect{
                println("Data collected: $it")
            }
        }
        delay(5000)
        job.cancel()
    }
}