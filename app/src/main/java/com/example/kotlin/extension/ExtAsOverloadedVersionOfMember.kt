package com.example.kotlin.extension

class ExtOverloadedExample{
    fun printClassName() = println("Class Method")
}

fun ExtOverloadedExample.printClassName(message: String){
    println("Extension Method - $message $this")
}

fun main(){
    with(ExtOverloadedExample()){
        printClassName("Hello")
        printClassName()
    }
}