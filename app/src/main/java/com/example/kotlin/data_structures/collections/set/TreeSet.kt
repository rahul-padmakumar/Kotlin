package com.example.kotlin.data_structures.collections.set

import java.util.TreeSet

/**
 * Not available in Kotlin. Can use in Kotlin from Java.utils pkg
 * TreeSet maintains sorting order
 */

fun main(){

    val list = listOf(10, 2, 3, 1, 6)
    val sortedSet = TreeSet(list)
    println(sortedSet.toList())
    println(sortedSet.descendingSet())
    println(sortedSet.higher(5))
    println(sortedSet.lower(4))
    println(sortedSet.subSet(2, 6))
    println(sortedSet.ceiling(5))
    println(sortedSet.floor(4))

    println(sortedSet.higher(6))
    println(sortedSet.lower(6))
    println(sortedSet.ceiling(6))
    println(sortedSet.floor(6))
}