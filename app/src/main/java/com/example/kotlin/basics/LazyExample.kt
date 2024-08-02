package com.example.kotlin.basics

fun main(){
    val list by lazy {
        generateList()
    }
    println("Enter value:")
    readlnOrNull()?.toInt()?.let {
        if(it == 5){
            generateList().forEach { number ->
                println(number)
            }
        } else {
            println("Enter value is $it")
        }
    }
}

fun generateList() = mutableListOf<Int>().apply {
    repeat(1000){
        add(it)
    }
}
