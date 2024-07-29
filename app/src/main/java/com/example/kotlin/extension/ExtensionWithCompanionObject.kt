package com.example.kotlin.extension

class ExtensionCompanionExample{
    companion object{
        fun printInfo(){
            println("Original Companion")
        }
    }
}

fun ExtensionCompanionExample.Companion.printCompanion() = println("Companion Extension")

fun main(){
    ExtensionCompanionExample.printInfo()
    ExtensionCompanionExample.printCompanion()
}