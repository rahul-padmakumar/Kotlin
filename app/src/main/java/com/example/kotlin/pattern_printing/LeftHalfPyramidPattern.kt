package com.example.kotlin.pattern_printing

fun main(){
    println("Enter the number of rows")
    val maxRows = readlnOrNull()?.toIntOrNull() ?: 0

    if(maxRows == 0){
        println("Enter zero as row count")
        return
    }

    for(i in 1..maxRows){
        for(j in 1..maxRows-i){
            print("\t")
        }
        for(k in 1..i){
            print("*\t")
        }
        println()
    }
}