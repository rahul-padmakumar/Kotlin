package com.example.kotlin.basics.loop.for_basics

fun main(){
    for(i in 1..10){
        println(i)
    }

    for(i in 10 downTo 1){
        println(i)
    }

    for(i in 10 downTo 1 step 2){
        println(i)
    }

    for(i in 1 until 10 step 3){
        println(i)
    }
}