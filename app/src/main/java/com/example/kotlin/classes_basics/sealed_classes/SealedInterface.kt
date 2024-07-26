package com.example.kotlin.classes_basics.sealed_classes

sealed interface IQuadrilateral

@Suppress("UNUSED_PARAMETER")
class Square(length: Int): IQuadrilateral

data class Rectangle(val length: Int, val breadth: Int): IQuadrilateral

fun main(){
    listOf(
        Square(100),
        Rectangle(50, 50)
    ).forEach {
        when(it){
            is Square -> println("Square")
            is Rectangle -> println("Rectangle")
        }
    }
}

