package com.example.kotlin.basics.returns_and_jumps.continue_basics

fun main(){
    for(i in 1..10){
        for(j in 1..10){
            if(i % 3 == 0) continue
            println("$i -> $j")
        }
    }
}