@file:Suppress("KotlinConstantConditions", "ReplaceGetOrSet")

package com.example.kotlin.data_structures.map

fun main(){

    val map = mapOf(Pair(1, "One"), Pair(2, "two"), Pair(3, "Three"))

    println(map)
    println(map::class.java)

    //size of map
    println(map.size)

    val emptyMap = mapOf<Int, String>()
    println(emptyMap.isNotEmpty())
    println(emptyMap)

    //get values
    println(map.get(1))
    println(map[1])
    println(map.getOrDefault(3, "No Key"))
    println(map.getOrElse(3){ "No Key"})
    println(map.getOrDefault(5, "No Key"))
    println(map.getOrElse(5){ "No Key"})

    //check if key is present
    println(map.containsKey(5))
    println(map.containsKey(3))

    //check if value is present
    println(map.containsValue("One"))
    println(map.containsValue("zero"))

    println(map.entries)
}