package com.example.kotlin.oops.polymorphism

open class DynamicPolymorphismShape{
    open fun draw(){
        println("Draw shape")
    }
}

class DynamicPolymorphismRectangle: DynamicPolymorphismShape(){
    override fun draw() {
        println("Draw rectangle")
    }
}

class DynamicPolymorphismSquare: DynamicPolymorphismShape(){
    override fun draw() {
        println("Draw square")
    }
}

fun main(){
    var shape: DynamicPolymorphismShape = DynamicPolymorphismRectangle()
    shape.draw()
    shape = DynamicPolymorphismSquare()
    shape.draw()
}