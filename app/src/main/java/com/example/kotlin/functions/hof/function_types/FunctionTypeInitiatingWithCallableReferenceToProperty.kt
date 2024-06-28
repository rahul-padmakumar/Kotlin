package com.example.kotlin.functions.hof.function_types

fun main(){
    val operation = ::sum
    println(operation())
    val list = ListSample()::list
    println(list())
    val a  = List<Int>::size
    println(a.invoke(listOf(2, 3)))
}

class ListSample{
    val list = listOf(1, 3, 5)
}

private val sum: Int = 56