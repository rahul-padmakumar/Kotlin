package com.example.kotlin.classes_basics.objects_basics

fun main(){
    println(CompanionObjectEg.TYPE)
    CompanionObjectEg.printMessage("Hello, all \nthis is me.")
}

class CompanionObjectEg{
    companion object{
        const val TYPE = "STATIC"
        fun printMessage(message: String) = println(message)
    }
}