package com.example.kotlin.functions.basics.scope

fun main(){
    printValue(1, 2, 3)
}

private fun printValue(vararg input: Int){
    val message = "Hi, "
    fun print(input: Int){ // local function can access local variables of enclosing function.
        println("$message $input")
    }
    for(item in input){
        print(item)
    }
}