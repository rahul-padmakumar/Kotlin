package com.example.kotlin.functions.hof.anonymous_func

/**
 * Anonymous function is similar to normal function except it will not have name and it differs
 * from lambda option to specify return type
 * Anonymous suspend function no support in Kotlin
 */
fun main(){

    val ex1: (Int, Int) -> Int = fun(a, b): Int{
        return a+b
    }
    println(ex1(1, 2))

    val ex2 = fun Int.(value : Int): Int{
        return this + value
    }
    println(2.ex2(4))

    val ex3 = fun(v1: Int, v2: Int) = v1 + v2 //return type not need for expression
    println(ex3(3, 4))
}