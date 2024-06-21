package com.example.kotlin.basics.conditional_operators.when_basics

fun main(){
    println("Enter the word")
    val input = readlnOrNull()
    input?.let {
        when(input){
            input.lowercase() -> println("lowercase")
            input.uppercase() -> println("uppercase")
            input.replace(input[0], input[0].uppercaseChar()) -> println("first letter caps")
            else -> println("mixed")
        }
    }
}