package com.example.kotlin.basics.conditional_operators

fun main(){

    println("Enter a number")
    val number = readlnOrNull()?.toIntOrNull()
    number?.let {
        if(it % 2 == 0){
            println("NUmber is even")
        } else {
            println("Number is odd")
        }
    }
}