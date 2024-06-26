package com.example.kotlin.functions.basics

fun main(){
    greet()
}

// If function does not return value its return type is Unit. We can omit return type if its unit.
private fun greet(){
    println("Hello user")
}