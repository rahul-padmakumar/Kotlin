package com.example.kotlin.basics.loop

fun main(){

    // for loop with list
    val list = listOf(1, 2, 3, 4, 5)

    for(number in list){
        println(number)
    }

    list.forEach {
        println(it)
    }

    //for loop with set
    val set = setOf(1, 2, 3, 4, 5)
    for(number in set){
        println(number)
    }

    set.forEach {
        println(it)
    }

    val map = mapOf(Pair(1, "One"), Pair(2, "two"), Pair(3, "three"))
    map.forEach { (key, value) -> println("$key:$value") }
    for((key, value) in map){
        println("$key: $value")
    }
}