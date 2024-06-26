package com.example.kotlin.functions.basics

fun main(){
    println("3 + 4 = ${sumOf(3, 4)}")
}

fun sumOf(num1: Int, num2: Int): Int{
    return num1 + num2
}