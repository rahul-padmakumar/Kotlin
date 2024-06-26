package com.example.kotlin.functions.basics

fun main(){
    greet("TestUser")
    greet("Developer")
}

private fun greet(userName: String){
    println("Hello, $userName. How are you?")
}