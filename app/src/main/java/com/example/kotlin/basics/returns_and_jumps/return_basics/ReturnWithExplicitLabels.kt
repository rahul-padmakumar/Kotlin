package com.example.kotlin.basics.returns_and_jumps.return_basics

fun main(){

    (1..10).forEach loop@{
        if(it % 5 == 0) return@loop
        println(it)
    }

    println("End of the programme")
}
