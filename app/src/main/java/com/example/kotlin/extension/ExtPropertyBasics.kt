package com.example.kotlin.extension

val <T> List<T>.lastElement: T
    get() = this[size - 1]

fun main(){
    val list = listOf(1, 2, 3, 4)
    println(list.lastElement)
}

