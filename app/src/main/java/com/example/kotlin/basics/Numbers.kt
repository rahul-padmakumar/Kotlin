package com.example.kotlin.basics

fun main(){
    val a = 23
    println("${a::class.java}")
    val aShort: Short = 34
    println("${aShort::class.java}")
    val aLong = 34L
    println("${aLong::class.java}")
    val b = 32.45
    println("${b::class.java}")
    val bFloat = 32.45F
    println("${bFloat::class.java}")
    println("${a.toLong()::class.java}")
    println("${aLong.toInt()::class.java}")
    val longValue = 75000000000000
    println("${longValue.toInt()}") //Be careful when converting large variable to small
    println("${bFloat.toLong()}")
    println(a.toString())
    println(b.toString())
}