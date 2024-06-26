package com.example.kotlin.functions.basics

fun main(){
    greet("Test User", "Hi,")
    greet("Tester")
    greetWithNonDefaultArgumentAfterDefault(name = "Developer")
    greetWithNonDefaultArgumentAfterDefault("Hi,", "UX")
    greetWithLamdaAfterDefault("User1"){
        println(it)
    }
    greetWithLamdaAfterDefault("User2", "Hola"){
        println(it)
    }
    greetWithLamdaAfterDefault("User3", "Hi,", fun(value: String){
        println(value)
    })
    greetWithLamdaAfterDefault("User4", "Hi,",{
        println(it)
    })
    // With named argument we change order of parameters
    greetWithLamdaAfterDefault(
        onResult = {
            println(it)
        },
        message = "Hi,",
        name = "User10"
    )

    Greet().greet("User5")
    GreetWithExclamation().greet("User6")
}

fun greet(name: String, message: String = "hello"){
    println("$message $name")
}

fun greetWithNonDefaultArgumentAfterDefault(message: String = "hello", name: String){
    println("$message $name")
}

fun greetWithLamdaAfterDefault(name: String, message: String = "hello", onResult: (String) -> Unit){
    onResult("$message $name")
}

open class Greet(){
    open fun greet(userName: String, message: String = "Hello"){
        println("$message $userName")
    }
}

class GreetWithExclamation(): Greet() {
    override fun greet(userName: String, message: String) {
        println("$message $userName!")
    }
}