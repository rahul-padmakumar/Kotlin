package com.example.kotlin.basics.conditional_operators

fun main(){
    println("Enter the mark")
    val mark = readlnOrNull()?.toDoubleOrNull()
    mark?.let {
        val grade = if(it >= 90){
            "A+"
        } else if(it >= 80){
            "A"
        } else if(it >= 70){
            "B"
        } else if(it >= 60){
            "C"
        } else if(it >= 50){
            "D"
        } else if(it >= 40){
            "E"
        } else {
            "F"
        }

        println("Grade is $grade")
    }
}