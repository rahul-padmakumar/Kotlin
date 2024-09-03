package com.example.kotlin.flow.exception_handling

import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.runBlocking

fun main(){

    val flow = flow{
        emit(1)
        kotlinx.coroutines.delay(1000)
        emit(2)
    }
    runBlocking {
        flow
            .onCompletion {
                if(it == null){
                    println("Completed successfully")
                } else{
                    println("Message: ${it.message}")
                }
            }.collect{
                println(it)
            }
    }
}