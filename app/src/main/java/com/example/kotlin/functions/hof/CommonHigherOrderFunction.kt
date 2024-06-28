package com.example.kotlin.functions.hof

fun main(){

    val list = listOf(1, 2, 29, 10, 56, 41, 34)

    list.forEach { println(it) }

    println(list.map { it * 2 })
    println(list.filter { it > 10 })
    println(list.reduce { acc, i -> acc + i })
    println(list.fold(10, {acc, i -> acc + i})) // fold we can provide an initial value which is not possible in reduce
    val twoDigitList = list.filter { it in 10..99 }
    println(twoDigitList.sortedBy { it%10 })
    println(twoDigitList.maxBy { it%10 })
    println(twoDigitList.minBy { it%10 })
}