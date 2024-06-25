package com.example.kotlin.basics.returns_and_jumps.return_basics

fun main(){
    (1..10).forEach(fun(value: Int){
        if(value % 5 ==0){
            return
        }
        println(value)
    })
    println("End of programme")
}