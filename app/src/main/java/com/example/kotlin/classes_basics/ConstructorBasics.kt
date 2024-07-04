package com.example.kotlin.classes_basics

fun main(){
    val box = Box(10, 15)
    box.draw()

    val box1 = Box1(10, 20)
    println(box1.draw())
}

class Box(
    private val width: Int,
    private val height: Int
){
    fun draw(){
        println("Box with height: $height and width: $width")
    }
}

class Box1{
    private val width: Int
    private val height: Int
    constructor(width: Int, height: Int){
        this.width = width
        this.height = height
    }

    fun draw(){
        println("Box with height: $height and width: $width")
    }
}
