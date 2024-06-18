package com.example.kotlin.data_structures.collections.list

import java.util.LinkedList

fun main(){

    val linkedList = LinkedList<Int>()
    linkedList.add(1)
    linkedList.addAll(listOf(2, 3, 5))
    linkedList.addFirst(0)
    linkedList.addLast(5)

    println(linkedList)
    linkedList.pop()
}