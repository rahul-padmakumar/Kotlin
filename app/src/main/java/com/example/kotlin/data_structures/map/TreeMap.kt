package com.example.kotlin.data_structures.map

import java.util.TreeMap

/**
 * Kotlin does not have implementation of TreeMap as it has map.toSortedMap()
 */

fun main(){

    val map = TreeMap<Int, String>()
    map[1] = "One"
    map[4] = "Four"
    map[3] = "Three"
    map[5] = "Five"
    map[2] =  "Two"

    println(map)
    println(map.descendingMap())
}