package com.example.kotlin.basics.loop.while_loop

fun main(){

    val list = listOf(1, 2, 3, 4, 5, 6)
    var index = 0

    while(index < list.size){
        println(list[index])
        index += 1
    }
}