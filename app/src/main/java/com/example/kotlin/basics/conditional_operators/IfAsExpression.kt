package com.example.kotlin.basics.conditional_operators

fun main(){
    println("Enter a number")
    val number = readlnOrNull()?.toIntOrNull()
    number?.let {
        val type = if(it % 2 == 0) {
            "Even"
        } else {
          "Odd"
        }
        println("The number $it is $type")
    }
}
