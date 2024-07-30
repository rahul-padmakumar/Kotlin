package com.example.kotlin.generics

class ParametrizedClass<T>(private val data: T){

    fun getValue(): T = data
}

fun main(){
    println(ParametrizedClass("Hello").getValue())
    println(ParametrizedClass<Int>(10).getValue())
}
