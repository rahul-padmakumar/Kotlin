package com.example.kotlin.data_structures.collections.set

/**
 * Mutable set is of type LinkedHashSet so maintains order of insertion and prevents duplicate element
 */
fun main(){

    val set = mutableSetOf(1, 2, 4, 4, 6) // maintains order since it is of type LinkedHashSet
    val emptyMutableSet = mutableSetOf<Int>()

    println(set)
    println(emptyMutableSet::class.java)

    set.add(7)
    println(set)
    set.addAll(listOf(8, 9))
    println(set)

    set.remove(7)
    println(set)
    set.removeAll(listOf(8, 9))
    println(set)
    set.removeIf { it % 2 == 0 }
    println(set)
    set.clear()
    println(set)

    set.addAll(setOf(2, 3, 5, 6))
    set.retainAll(setOf(5, 6))
    println(set)
    set.addAll(sequenceOf(1, 2, 4, 5, 6))
    println(set)
    println(set.subtract(listOf(1, 7, 8)))
    println(set.plus(listOf(7, 8)))
}