package com.example.kotlin.functions.basics

fun main(){
    println(middleItem(listOf(1,2,3,4,5)))
    println(middleItem(listOf("jan", "feb", "mar", "apr", "may", "june", "jul")))
}

private fun <T> middleItem(input: List<T>): T = input[input.size / 2]