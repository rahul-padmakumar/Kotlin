package com.example.kotlin.functions.standard_functions

import kotlin.random.Random

fun main(){
    val number = Random.nextInt(10, 100)
    number.takeIf { it % 2 == 0 }?.let {
        println("Even number is  $it")
    }
    number.takeUnless { it % 2 == 0 }?.let {
        println("Odd number is $it")
    }
}