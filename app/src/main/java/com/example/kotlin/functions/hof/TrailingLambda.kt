package com.example.kotlin.functions.hof

fun main(){

    listOf(1, 2, 45, 46, 7, 9).forEachEven { println(it) }
    forEachOdd(listOf(3, 45, 90, 77, 11)){ println(it) }
}


fun List<Int>.forEachEven(a: (Int)->Unit){
    this.filter { it % 2 == 0 }.forEach {
        a(it)
    }
}

fun forEachOdd(list: List<Int>, a: (Int) -> Unit){
    list.filter { it % 2 != 0 }.forEach { a(it) }
}
