package com.example.kotlin.functions.standard_functions

fun main(){
    val divisibleByFive = run {
        val list = mutableListOf(10, 20, 23, 24, 27)
        list.filter { it % 5 == 0 }.map { it * 2 }
    }
    println(divisibleByFive)
    val divisibleByThree = runNonExtension {
        val list = mutableListOf(10, 20, 23, 24, 27)
        list.filter { it % 3 == 0 }.map { it * 2 }
    }
    println(divisibleByThree)
}

private inline fun <R> runNonExtension(block: () -> R): R = block()