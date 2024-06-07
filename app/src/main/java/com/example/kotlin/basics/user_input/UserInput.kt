package com.example.kotlin.basics.user_input

fun main(){
    println("Enter your name")
    val name = readlnOrNull()
    println("Entered name is $name")
}