package com.example.kotlin.data_structures.map

/**
 * Mutable map uses linked hash map so it retains order of insertion.
 */

fun main(){

    val map = mutableMapOf(Pair(1, "One"), Pair(2, "Two"), Pair(3, "Three"))

    println(map)
    println(map::class.java)

    map.put(5, "Four")
    map[4] = "Five"
    println(map)

    map.putAll(mapOf(Pair(6, "Six"), Pair(7, "Seven")))
    println(map)

    map.replace(3, "Tree")
    println(map)

    map.replaceAll { t, u ->
        if(t % 2 == 0){
            "Zero"
        } else {
            u
        }
    }

    println(map)

    map.remove(1)
    println(map)

    map.toSortedMap()
    println(map)

    map.clear()
    println(map)
}