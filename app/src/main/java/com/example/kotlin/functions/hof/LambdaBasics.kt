package com.example.kotlin.functions.hof

import kotlinx.coroutines.flow.merge

fun main(){
    /**
     * {a: Int, b: Int -> a + b}
     * Enclosed by {}
     * comma separated parameters with optional type
     * followed by ->
     * followed by function body
     */
    val ex1 = {a: Int, b: Int -> a + b}
    println(ex1(3, 4))

    val ex2 = { message: String ->
        println(message)
    }
    ex2("Hello")

    val ex3: (String) -> Unit = {// it: implicit name of a single parameter
        println(it)
    }
    ex3("hi")

    val ex4: (String, String) -> Unit = {a, b ->
        val c = a+b
        println(c)
    }
    println(ex4("Hello", "User"))

    //Return from lambda

    val ex5: (String) -> String = {
        it.uppercase() //last statement indicates return value
    }
    println(ex5("kitten"))

    //Only named return can be used from lambda else we need to make it inline
    val ex6 = lambda@{ a: String ->
        return@lambda a.lowercase()
    }
    println(ex6("FULL CAPS"))

    //underscore for unused variables
    val ex7: (String, String) -> Unit = {_, value -> println(value) }
    ex7("Hello", "Hii")
    listOf(1, 2, 3, 4).forEachIndexed { _, i ->
        println(i)
    }
}

