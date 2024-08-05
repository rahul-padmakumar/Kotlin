package com.example.kotlin.classes_basics.inline_basics

@JvmInline
value class InlineMemberPerson(private val fullName: String){

    init {
        println("Init block: Fullname - $fullName")
    }

    constructor(firstName: String, secondName: String): this("$firstName $secondName"){
        println("Constructor: $fullName")
    }

    val length: Int
        get() = fullName.length

    fun greet(){
        println("Hello, $fullName")
    }
}

fun main(){
    val p1 = InlineMemberPerson("Kotlin")
    val p2 = InlineMemberPerson("Dev", "Test")

    p1.greet()
    println(p1.length)
    p2.greet()
    println(p2.length)
}