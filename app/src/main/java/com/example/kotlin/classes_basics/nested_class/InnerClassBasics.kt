package com.example.kotlin.classes_basics.nested_class

class Encloser{
    private val bar: Int = 1
    inner class Inner{
        fun printData() = println("Inner class - $bar")
    }
}

fun main(){
    Encloser().Inner().printData()
}