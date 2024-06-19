package com.example.kotlin.data_structures.map

/**
 * Hash map never preserves order of insertion
 */

fun main(){
    val map = hashMapOf(Pair(1, "One"), Pair(3, "Three"), Pair(2, "Two"))

    println(map)

    map[7] = "seven"
    println(map)

    map[6] = "Six"
    println(map)
}