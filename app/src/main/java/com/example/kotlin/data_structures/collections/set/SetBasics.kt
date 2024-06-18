@file:Suppress("KotlinConstantConditions")

package com.example.kotlin.data_structures.collections.set

fun main(){

    val set = setOf(1, 2, 5, 5, 6)
    println(set)

    val emptySet = setOf<Int>()
    println(emptySet.isEmpty())

    val setWithNullValue = setOf(1, 2, null, null) // A set can contain only one null value
    println(setWithNullValue)

    println(set.size)

    println(set.contains(6))
    println(set.containsAll(listOf(1, 2)))
    println(set.containsAll(setOf(5, 2, 6)))
}