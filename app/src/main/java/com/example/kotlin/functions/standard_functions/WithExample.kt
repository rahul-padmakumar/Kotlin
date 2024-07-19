package com.example.kotlin.functions.standard_functions

fun main(){
    val person = Person()
    with(person){
        firstName = "Alex"
        secondName= "Bob"
        printName()
    }
    person.printName()
    withExample(person){
        firstName = "Alex1"
        secondName= "Bob1"
        printName()
    }
}

private inline fun <T, R> withExample(receiver: T, block: T.() -> R): R{
    return receiver.block()
}

private class Person{

    var firstName: String = ""
    var secondName: String = ""
    fun printName() = println("$firstName $secondName")
}