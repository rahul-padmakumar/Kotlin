package com.example.kotlin.basics.conditional_operators.when_basics

fun main(){

    println("Enter the string")
    val input = readlnOrNull()
    input?.let {
        when(val length = it.length){
            in 0..5 -> println("$length is weak")
            in 6..9 -> println("$length is moderate")
            in 10..15 -> println("$length is good")
            else -> println("$length is strong")
        }
    }
}