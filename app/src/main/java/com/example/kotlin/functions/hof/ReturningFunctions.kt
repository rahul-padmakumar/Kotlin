package com.example.kotlin.functions.hof

fun main(){

    println(operation()(5, 2))
}

fun powerOf(a: Int, b: Int) = Math.pow(a.toDouble(), b.toDouble()).toLong()

fun operation(): (Int, Int) -> Long = ::powerOf