package com.example.kotlin.basics.nullability

fun main(){
    var name: String? = "Test"
    println(name?.length)
    println(name!!.length) //Non-Null assertion operator
    name = null
    println(name?.length)
}