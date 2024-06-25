package com.example.kotlin.basics.returns_and_jumps.return_basics

fun main(){

    for( i in 1..10){
        if(i % 5 == 0){
            return
        } else{
            println(i)
        }
    }
    println("End of programme")
}