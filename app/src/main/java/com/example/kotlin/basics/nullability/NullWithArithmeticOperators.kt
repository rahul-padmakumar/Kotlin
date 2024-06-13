package com.example.kotlin.basics.nullability

fun main(){

    var a: Int? = null
    println("${a?.plus(10)}")
    a = 10
    println("${a?.plus(2)}")
    println("${a?.minus(2)}")
    println("${a?.plus(2)}")
    println("${a?.times(2)}")
    println("${a?.div(2)}")
    println("${a?.mod(3)}")
    println("${a?.inc()}")
    println("${a?.dec()}")
    println("${a?.and(10)}")
}