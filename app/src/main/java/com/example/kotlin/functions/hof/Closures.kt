package com.example.kotlin.functions.hof

/**
 * closures are functions that can access variables defined in outerscopes, and can modify it.
 */
fun main(){

    var sum = 0
    listOf(1, 2, 3, 4, 5).forEach {
        sum += it
    }
    println(sum)
}