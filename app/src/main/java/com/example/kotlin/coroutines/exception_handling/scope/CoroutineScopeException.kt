package com.example.kotlin.coroutines.exception_handling.scope

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){

    runBlocking {
        try {
            coroutineScope {
                launch {
                    throw RuntimeException("Testing")
                }
            }
        } catch (e: Exception){
            println(e.message)
        }
    }
}