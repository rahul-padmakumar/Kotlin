package com.example.kotlin.classes_basics.inline_basics


/**
 * Used to wrappers that are more domain specific type
 * will be inlined as string at the site of usage
 */

@JvmInline
value class Password(val value: String)

fun checkWhetherValidPassword(password: Password): Boolean =
    password.value.length > 3

fun main(){
    println("abc is a valid password: ${checkWhetherValidPassword(Password("abc"))}")
    //checkWhetherValidPassword("abx") - will create compile time error
    println("abcde is a valid password: ${checkWhetherValidPassword(Password("abcde"))}")
}