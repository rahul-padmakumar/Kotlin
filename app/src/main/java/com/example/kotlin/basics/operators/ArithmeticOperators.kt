package com.example.kotlin.basics.operators

fun main(){
    println(2 + 3)
    println("He"+"llo")
    println(5 - 2)
    println(5 * 2)
    println(4 / 2)
    println(5 % 2)

    var num1 = 5
    println("${num1++}") // num1++ -> increment will be available at next usage
    println("$num1")

    println("${++num1}")

    println("${num1--}")
    println("$num1")
    println("${--num1}")
}