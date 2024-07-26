package com.example.kotlin.classes_basics.sealed_classes

private sealed class Shape{
    @Suppress("UNUSED_PARAMETER")
    class Circle(radius: Int): Shape()

    data class Triangle(val base: Int, val height: Int, val angle: Int): Shape()
}

private data object NoShape: Shape()

fun main(){
    listOf(
        Shape.Circle(12),
        Shape.Triangle(10, 5, 60)
    ).forEach {
        when(it){
            is Shape.Circle -> println("Circle")
            is Shape.Triangle -> println("Triangle")
            is NoShape -> println()
        }
    }
}