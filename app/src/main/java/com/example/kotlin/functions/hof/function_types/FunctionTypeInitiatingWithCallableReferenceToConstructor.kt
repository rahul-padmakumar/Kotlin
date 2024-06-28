package com.example.kotlin.functions.hof.function_types

fun main(){
    val a = ::UserDetails
    println(a.invoke("rahul", "123456").printUserDetails())
}

private class UserDetails(val name: String, val phone: String){
    fun printUserDetails(){
        println("Name: $name, Phone: $phone")
    }
}