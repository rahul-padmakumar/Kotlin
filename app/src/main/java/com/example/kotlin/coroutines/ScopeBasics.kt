package com.example.kotlin.coroutines

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * function to create coroutine scopes
 * runBlocking
 * GlobalScope.launch
 * launch
 * coroutineScope
 */
@OptIn(DelicateCoroutinesApi::class)
fun main(){
    runBlocking {
        launch {
            delay(1000L)
            println("Launched on run blocking")
        }
        GlobalScope.launch {
            delay(500L)
            println("Launched in global scope")
        }
        coroutineScope {
            delay(5000L)
            println("Launched in coroutine scope")
        }
        CoroutineScope(Dispatchers.Default).launch {
            delay(2000L)
            println("Launched in Custom coroutine scope")
        }
        delay(3000L)
    }
}