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

@JvmInline
value class InlineClassDelegation(private val printable: Printable): Printable by printable

fun main(){
    val eg1 = InlineInheritanceName("Kotlin")
    println(eg1.prettyPrint())

    val eg2 = InlineClassDelegation(object : Printable{
        override fun prettyPrint(): String = "Hello delegate"
    })
    println(eg2.prettyPrint())
}