@file:Suppress("ReplaceGetOrSet", "KotlinConstantConditions")

package com.example.kotlin.data_structures.collections.list

/**
 * List maintains order of insertion and can contain duplicate elements
 */

fun main(){
    val list = listOf(1, 2, 3, 5, 5, 6)
    println(list)
    val emptyList= listOf<Int>() // type needs to be specified for empty list else type will be inferred from elements

    println(emptyList.isEmpty()) //check if list contains elements or not

    println(list.size) // get number of elements in a list

    val listWithNullElement = listOf(1, 2, null, null)
    println(listWithNullElement)

    //retrieve elements from list
    println(list[0])
    println(list[2])
    println(list.get(4)) // use  get or with index if there is 100% sure that index exist else use below ones
    println(list.getOrNull(5))
    println(list.getOrNull(15))
    println(list.getOrElse(3) { -1 })
    println(list.getOrElse(45){ -1})

    //get index uses linear search
    println(list.indexOf(5))
    println(list.lastIndexOf(5))

    //contains
    println(list.contains(6))
    println(list.containsAll(listOf(1,2,5,6)))

    val sublist = list.subList(1, 3) // from 1 to 2, to index is excluded
    println(sublist::class.java)
    println(sublist)

    //reverse list
    println(list.asReversed())
}