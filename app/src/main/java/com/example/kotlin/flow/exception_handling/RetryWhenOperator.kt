package com.example.kotlin.flow.exception_handling

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.retryWhen
import kotlinx.coroutines.runBlocking

fun main(){

    val flow = flow{
        emit(1)
        delay(1000)
        emit(2)
        throw RuntimeException("Error")
    }.retryWhen{ exception, attempt ->
        exception is RuntimeException && attempt != 3L
    }
    runBlocking {
        try {
            flow
                .catch{
                    println("Catch operator: ${it.message}")
                }
                .onCompletion {
                    if(it == null){
                        println("Completed successfully")
                    } else{
                        println("Message: ${it.message}")
                    }
                }.collect{
                    println(it)
                }
        } catch (e: Exception){
            println("Exception caught: ${e.message}")
        }
    }
}