package com.example.kotlin.classes_basics

fun main(){

    val cublicle = Cublicle()
    cublicle.length = 100
    cublicle.breadth = 50
    cublicle.height = 75
    println(cublicle.breadth)
    println(cublicle.length)
    println(cublicle.height)
    println(cublicle.area)
    cublicle.breadth = 125
    println(cublicle.breadth)
    println(cublicle.area)
}
@Suppress("RedundantGetter", "RedundantSetter")
private class Cublicle{
    var length: Int = 0
    var height: Int = 0
        get() = field
        set(value){
            field = value
        }

    var breadth: Int = 0
        set(value){
            field = if(value < length){
                length
            } else value
        }

    val area: Int
        get() = breadth * length
}