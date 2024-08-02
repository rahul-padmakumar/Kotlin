package com.example.kotlin.basics

fun main(){

    val dataList = listOf(1, 1.3, false, "Hello")

    println("Enter a value:")
    readlnOrNull()?.toInt()?.let {
        val dataToCheck = if(it >= dataList.size){
            dataList.last()
        } else dataList[it]
        val type = when(dataToCheck){
            is Int -> "Integer"
            is String -> "String"
            is Double -> "Double"
            is Boolean -> "Boolean"
            else -> "an unknown type"
        }
        println("The selected data is $type")
    }
}