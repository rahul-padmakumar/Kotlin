package com.example.kotlin.basics.returns_and_jumps.break_basics

fun main(){
    loop@ for(i in 1..10){
        for(j in 1..10){
            if(i % 3 == 0) break@loop
            else println("$i -> $j")
        }
    }
}