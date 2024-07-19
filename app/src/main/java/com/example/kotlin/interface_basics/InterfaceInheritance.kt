package com.example.kotlin.interface_basics

private interface Named{
    val name: String
    fun printName()
}

private interface Person: Named{
    val firstName: String
    val lastName: String
    override val name: String
        get() = "$firstName $lastName"
}

private class Employee(
    override val firstName: String,
    override val lastName: String
) : Person{
    override fun printName() {
        println(name)
    }

}

fun main(){

    val employee = Employee("Alex", "Bob")
    employee.printName()
}