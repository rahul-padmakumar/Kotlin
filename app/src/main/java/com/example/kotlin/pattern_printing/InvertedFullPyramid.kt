package com.example.kotlin.pattern_printing

fun main(){
    println("Enter the number of rows")
    val maxRows = readlnOrNull()?.toIntOrNull() ?: 0

    if(maxRows == 0){
        println("Enter zero as row count")
        return
    }

    for(i in 1..maxRows){

        var k = 1

        for(space in 1 until i){
            print("\t")
        }

        while (k <= ((2 * (maxRows - i)) - 1)){
            print("*\t")
            k += 1
        }
        println()
    }
}