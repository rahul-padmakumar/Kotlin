package com.example.kotlin.classes_basics.nested_class

class Outer{
    class Nested{
        fun printData() = println("Nested class")
    }
}

fun main(){
    Outer.Nested().printData()
}