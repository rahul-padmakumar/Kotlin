@file:Suppress("ReplaceGetOrSet")

package com.example.kotlin.data_structures.collections.list

fun main(){

    val list = mutableListOf(1, 2, 3, 4, 5, 5)
    val emptyMutableList = mutableListOf<Int>()
    val emptyArrayList = arrayListOf<Int>()

    //type
    println(list::class.java)
    println(emptyArrayList::class.java)

    //add
    list.add(6)
    println(list)
    list.addAll(listOf(7, 8, 9))
    println(list)

    // remove
    list.removeAt(0)
    println(list)
    list.remove(6)
    println(list)
    list.removeAll(listOf(8, 9))
    println(list)
    list.remove(5)
    println(list)
    list.removeFirst()
    println(list)
    list.removeLast()
    println(list)
    list.removeLastOrNull()
    println(list)
    list.removeFirstOrNull()
    println(list)
    emptyMutableList.removeFirstOrNull()
    println()

    list.addAll(arrayOf(1, 2, 4, 5, 6))

    println(list)
    list.removeIf {
        it % 2 == 0
    }
    println(list)

    //replace
    list.addAll(setOf(1, 2, 3))
    println(list)
    list.set(2, 2)
    list[3] = 4
    println(list)

    // replace all
    list.replaceAll {
        if(it % 2 == 0){
            0
        } else it
    }
    println(list)

    list.retainAll(listOf(1,5))
    println(list)

    list.reverse()
    println(list)

    list.addAll(sequenceOf(23, 25, 26))
    println(list)
    list.shuffle()
    println(list)

    list.clear()
    println(list.isEmpty())
}