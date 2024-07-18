package com.example.kotlin.oops.polymorphism

class PolymorphismAdd{

    fun add(a: Int, b: Int) = a + b
    fun add(a: Double, b: Double) = a + b
    fun add(a: String, b: String) = a.length + b.length
}

fun main(){
    val obj1 = PolymorphismAdd()
    println(obj1.add(10, 5))
    println(obj1.add(5.5, 14.5))
    println(obj1.add("Tester", "Dev"))
}