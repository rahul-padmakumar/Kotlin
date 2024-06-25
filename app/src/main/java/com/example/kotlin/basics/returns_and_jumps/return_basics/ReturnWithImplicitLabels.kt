package com.example.kotlin.basics.returns_and_jumps.return_basics

fun main(){

    (1..10).forEach {
        if(it % 5 == 0) return@forEach
        println(it)
    }

    println("End of the programme")
}