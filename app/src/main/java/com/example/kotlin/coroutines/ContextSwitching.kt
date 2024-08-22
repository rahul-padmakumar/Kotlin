package com.example.kotlin.coroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun main(){
    runBlocking {
        println("Running in ${Thread.currentThread().name}")
        withContext(Dispatchers.Default){
            println("Running in ${Thread.currentThread().name}")
        }
        withContext(Dispatchers.IO){
            println("Running in ${Thread.currentThread().name}")
        }
    }
}