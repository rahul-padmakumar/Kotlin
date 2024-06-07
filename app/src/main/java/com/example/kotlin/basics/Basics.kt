package com.example.kotlin.basics


const val NAME = "String" // Compile time constant
fun main(){
    //mutable variables
    var a = 10
    a = 20
    println(a)

    //immutable variables
    val b = 10
    //b = 20 - error
}
