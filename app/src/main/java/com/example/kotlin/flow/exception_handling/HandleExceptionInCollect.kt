package com.example.kotlin.flow.exception_handling

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.emitAll
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.runBlocking
import java.lang.RuntimeException

/**
 * Catch operator will collect only exception in upstream
 */
fun main(){

    val flow = flow{
        emit(1)
        delay(1000)
        emit(2)
    }
    runBlocking {
        flow
            .catch{
                println("Catch operator: ${it.message}")
                emitAll(flowOf(10, 10, 20))
            }
            .onCompletion {
                if(it == null){
                    println("Completed successfully")
                } else{
                    println("Message: ${it.message}")
                }
            }.onEach{
                println(it)
                throw RuntimeException("Error")
            }.catch {
                println("Catch operator2: ${it.message}")
            }.launchIn(this)
    }
}