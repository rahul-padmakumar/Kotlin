package com.example.kotlin.functions.basics.scope

class Printer{
    fun print(message: String){
        println(message)
    }
}

fun main(){
    Printer().print("hello")
}