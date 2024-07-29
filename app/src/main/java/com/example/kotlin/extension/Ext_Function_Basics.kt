package com.example.kotlin.extension

fun <T> MutableList<T>.swap(firstPos: Int, secondPos: Int){
    this[firstPos] = this[secondPos].also {
        this[secondPos] = this[firstPos]
    }
}

fun main(){
    val list = mutableListOf(1, 2, 3, 4)
    println(list)
    list.swap(0, 1)
    println(list)
}