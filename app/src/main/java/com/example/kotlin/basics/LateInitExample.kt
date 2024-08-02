package com.example.kotlin.basics


lateinit var name: String

fun main(){
    printData()
    name = "Hello"
    printData()
}

private fun printData(){
    if(::name.isInitialized){
        println(name)
    } else println("Not initialized")
}