package com.example.kotlin.basics

import kotlin.math.abs
import kotlin.random.Random

fun main(){
    println(abs(Random.nextInt()))
    println(Random.nextInt(10))
    println(Random.nextInt(5, 25))
    println(Random.nextDouble(20.0, 21.0))
}