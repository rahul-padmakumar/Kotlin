package com.example.kotlin.classes_basics.inline_basics

/**
 * Cannot extend other classes and is always final
 */

interface Printable{
    fun prettyPrint(): String
}

@JvmInline
value class InlineInheritanceName(private val s: String): Printable{
    override fun prettyPrint(): String = "Hello, $s"
}

fun main(){
    val name = InlineInheritanceName("Kotlin")
    println(name.prettyPrint())
}