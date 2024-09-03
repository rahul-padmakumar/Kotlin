package com.example.kotlin.flow.exception_handling

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.retry
import kotlinx.coroutines.runBlocking
import java.lang.RuntimeException

fun main(){

    val flow = flow{
        emit(1)
        delay(1000)
        emit(2)
        throw RuntimeException("Error")
    }.retry(3){
        it is RuntimeException
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