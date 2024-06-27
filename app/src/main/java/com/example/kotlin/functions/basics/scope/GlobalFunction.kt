package com.example.kotlin.functions.basics.scope

fun main(){
    testPrint("Hi")
    testPrint("Hello")
}

/**
 * Global function and it can be accessed from any files
 */
fun testPrint(message: String){
    println(message)
}