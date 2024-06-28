package com.example.kotlin.functions.hof.function_types

fun main(){
    val sum: (Int, Int) -> Int = {a, b -> a+b}
    /**
     *  in above (Int, Int) -> Int => function type
     *  {a, b -> a+b} => initiating function using lambda
     *  sum.invoke(5, 6) => invoking function type using invoke operator
     *  sum(5, 5) => invoking function type
     */
    println(sum.invoke(5, 6))
    println(sum(5, 5))
}