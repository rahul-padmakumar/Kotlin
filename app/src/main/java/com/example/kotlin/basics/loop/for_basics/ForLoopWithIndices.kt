package com.example.kotlin.basics.loop.for_basics

fun main(){
    val list = listOf(1, 2, 3, 4, 5)
    for(i in list.indices){
        println(list[i])
    }

    for((index, value) in list.withIndex()){
        println("$index -> $value")
    }

    val array = arrayOf(1, 2, 3, 4, 5)
    for(i in array.indices){
        println(array[i])
    }

    for((index, value) in array.withIndex()){
        println("$index -> $value")
    }
}