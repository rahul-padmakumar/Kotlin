package com.example.kotlin.threads

import kotlin.concurrent.thread
import kotlin.random.Random


private val productList = mutableListOf<Int>()

val lock = Object()

fun main(){
    producerThread()
    consumerThread()
}

fun producerThread(){
    thread {
        if(productList.size == 10){
            synchronized(lock){
                lock.wait()
            }
        }
        val item = Random.nextInt(1, 100)
        productList.add(item)
        println("Produced item -> $item")
        synchronized(lock){
            lock.notifyAll()
        }
    }
}

fun consumerThread(){
    thread {
        if(productList.isEmpty()){
            synchronized(lock){
                lock.wait()
            }
        }
        val item = productList.last()
        productList.remove(item)
        println("consumed item -> $item")
        synchronized(lock){
            lock.notifyAll()
        }
    }
}
