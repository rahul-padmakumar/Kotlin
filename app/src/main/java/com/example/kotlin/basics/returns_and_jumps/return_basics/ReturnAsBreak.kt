package com.example.kotlin.basics.returns_and_jumps.return_basics

fun main(){
    run loop@{
        (1..10).forEach {
            if(it % 5 == 0) return@loop
            println(it)
        }
    }
    println("End of programme")
}