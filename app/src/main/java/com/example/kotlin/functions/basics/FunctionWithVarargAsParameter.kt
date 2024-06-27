package com.example.kotlin.functions.basics

fun main(){
    printValue(1, 2, 3, 4, 5)
    val numberArray = arrayOf(1, 2, 3, 4, 5).toIntArray()
    printValue(*numberArray)
    printValue(1, 2, *numberArray, 10, 100)
    val numberIntArray = intArrayOf(1, 2, 3)
    printValue(*numberIntArray)
    printValue(1, 2, 3, message = "Hello")
    printDouble(1, 2, 3){
        println(it)
    }
    printDouble(1, 2, 3, callback = {
        println(it)
    })
}

/**
 * Only one parameter can be vararg
 */
private fun printValue(vararg input: Int){
    // vararg is available as Array<out T>
    for(index in input.indices){
        print(input[index])
        if(index != input.size - 1){
            print(" ")
        }
    }
    println()
}

private fun printValue(vararg input: Int, message: String){
    for(index in input.indices){
        print("$message ${input[index]}")
        if(index != input.size - 1){
            print(" ")
        }
    }
    println()
}

private fun printDouble(vararg input: Int, callback: (Int) -> Unit){
    for(item in input){
        callback(item * 2)
    }
}