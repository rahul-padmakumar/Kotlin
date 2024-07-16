package com.example.kotlin.oops.inheritance

fun main(){

    val value = InheritanceWithConstructorsBase(10)
    println(value.value)

    val valueA = InheritanceWithConstructorsA(20)
    println(valueA.value)

    val valueB = InheritanceWithConstructorsB(30)
    println(valueB.value)

    val valueC = InheritanceWithConstructorsB(40, "Hello")
    println(valueC.value)
    println(valueC.message)

    val valueD = InheritanceWithConstructorsA(50, "Hi")
    println(valueD.value)
    println(valueD.message)
}

open class InheritanceWithConstructorsBase(val value: Int)

class InheritanceWithConstructorsA(private val valueA: Int): InheritanceWithConstructorsBase(valueA){

    var message: String = ""
        private set

    constructor(value: Int, message: String): this(value){
        this.message = message
    }
}

class InheritanceWithConstructorsB: InheritanceWithConstructorsBase{

    var message: String = ""
        private set
    constructor(value: Int): super(value)

    constructor(value: Int, message: String): super(value){
        this.message = message
    }
}