@file:Suppress("KotlinConstantConditions")

package com.example.kotlin.basics.conditional_operators.when_basics

fun main(){

    println("Enter a value")
    val input = readlnOrNull()?.toIntOrNull()
    val value = input?.let {
         when(input){
            0 -> 1
            1 -> 2.5
            else -> "Hello"
        }
    } ?: "Hello"
    val type = when(value){
        is String -> "String"
        is Int ->"Int"
        is Double -> "Double"
        else -> "Invalid type"
    }
    println("type of $value is $type")
}