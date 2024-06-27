package com.example.kotlin.functions.infix

import kotlin.math.roundToInt

/**
 * Infix criteria
 * - must be either a extension function or member function
 * - parameter cannot be vararg or with default value
 * - Single parameter
 */

fun main(){
    println(1 add 2.4F)
    println(2 add 3.7F)
    println(StringHelper("Hello") add "User")
}

infix fun Int.add(data: Float) = this + data.roundToInt()

class StringHelper(private val content: String){
    infix fun add(data: String) = "$content $data"
}