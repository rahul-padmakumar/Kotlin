package com.example.kotlin.basics.user_input

fun main(){
    println("Enter a number you like")
    val number = readlnOrNull()?.toInt() ?: 0
    println("$number's square is ${number*number}")
}