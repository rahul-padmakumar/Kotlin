package com.example.kotlin.coroutines

import kotlinx.coroutines.runBlocking
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

interface Operation<T>{
    fun performAsync(callback: (T?, Throwable?) -> Unit)
}

suspend fun <T> Operation<T>.perform(): T = suspendCoroutine {
    performAsync { value, throwable ->
        when{
            throwable != null || value == null ->
                it.resumeWithException(throwable ?: Throwable("Null value"))
            else ->
                it.resume(value)
        }
    }
}

fun main(){
    val operation = object : Operation<Int> {
        override fun performAsync(callback: (Int?, Throwable?) -> Unit) {
            Thread.sleep(1000)
            callback.invoke(1, null)
        }
    }
    println("hello")
    runBlocking {
        val value = operation.perform()
        println("Value is: $value")
    }
}