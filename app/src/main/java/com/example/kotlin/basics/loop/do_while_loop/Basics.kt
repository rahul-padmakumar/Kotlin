package com.example.kotlin.basics.loop.do_while_loop

// exit controlled loop - executes body atleast once

fun main(){

    var input: String? = null
    do{
        println("Enter a word")
        input = readlnOrNull()
        println(input)
    } while (input != "stop")
}