package com.example.kotlin.extension

/**
 * Extension functions are resolved statically
 * In the below example even though Rectangle object is passed to printClassName
 * only StaticShape is considered since Rectangle will be available at run time
 */

open class StaticShape
class StaticRectangle: StaticShape()

fun StaticShape.getName() = "Shape"
fun StaticRectangle.getName() = "Rectangle"

fun printClassName(s: StaticShape){
    println(s.getName())
}

fun main(){
    printClassName(StaticRectangle())
}
