@file:Suppress("USELESS_IS_CHECK")

package com.example.kotlin.oops.inheritance

/**
 * Every Kotlin class has Any as a superclass.
 * Any class has three functions - hashcode, equals and toString()
 */

fun main(){
    val anyClassBasics = AnyClassBasics()
    println(anyClassBasics is Any)
}

class AnyClassBasics