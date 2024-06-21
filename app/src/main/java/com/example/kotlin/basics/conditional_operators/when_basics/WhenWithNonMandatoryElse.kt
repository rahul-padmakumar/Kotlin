package com.example.kotlin.basics.conditional_operators.when_basics

import kotlin.random.Random

/**
 * If when is used as an expression, the else branch is mandatory,
 * unless the compiler can prove that all possible cases are covered with branch conditions
 * for example, with enum class entries and sealed class subtypes).
 */
enum class Bit{
    ZERO,
    ONE
}

fun main(){
    when(Random.nextInt(0, 2)){
        Bit.ZERO.ordinal -> println("Zero")
        Bit.ONE.ordinal -> println("One")
    }
}