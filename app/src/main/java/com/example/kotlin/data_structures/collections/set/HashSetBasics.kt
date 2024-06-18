package com.example.kotlin.data_structures.collections.set

// Unlike mutableSet hash set will not maintain order of insertion

fun main(){

    val hashSet = hashSetOf<Int>()

    println(hashSet::class.java)

    hashSet.add(2)
    hashSet.add(3)

    hashSet.addAll(listOf(4, 5, 6))

    println(hashSet)

    hashSet.add(10)
    println(hashSet)

    hashSet.removeAll(listOf(5, 6, 10))
    println(hashSet)
}