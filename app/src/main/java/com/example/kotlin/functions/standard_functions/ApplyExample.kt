package com.example.kotlin.functions.standard_functions

/**
 * Apply the following assignments to the object
 */
fun main(){
    var person = ApplyPerson().apply {
        name = "Tester"
        age = 10
        city = "Nashville"
    }
    person.printData()
    person = ApplyPerson().applyExample {
        name = "Tester1"
        age = 27
        city = "North Pole"
    }
    person.printData()
}

private class ApplyPerson{
    var name: String = ""
    var age: Int = 0
    var city: String = ""

    fun printData(){
        println("Name - $name, age = $age, city = $city")
    }
}

private inline fun <T> T.applyExample(block: T.() -> Unit): T{
    block()
    return this
}