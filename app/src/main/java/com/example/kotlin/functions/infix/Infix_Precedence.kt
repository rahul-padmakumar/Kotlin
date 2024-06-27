package com.example.kotlin.functions.infix

fun main(){
    // infix less precedence than arithmetic operators
    println(1 add 3.35f + 3.65f)
    println((1 add 3.35f) + 3.65f)

    // infix less precedence than type cast operator
    val collection: Collection<Int> = setOf(1, 2, 3, 4, 5)
    val set1 = setOf(6, 7, 8, 9)
    println(set1 union collection as Set<Int>)

    //infix less precedence than rangeTo operator
    println(0 until 10 * 2)
    println(0 until  (10 * 2))

    //infix more precedence than boolean operators and in operator
    println(true && false xor true)
}