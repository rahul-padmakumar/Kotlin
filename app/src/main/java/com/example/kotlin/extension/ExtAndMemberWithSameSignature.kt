package com.example.kotlin.extension

class ExtMemberExample{
    fun printFunctionType(){
        println("Class Method")
    }
}

fun ExtMemberExample.printFunctionType(){
    println("Extension method")
}

fun main(){
    ExtMemberExample().printFunctionType()
}