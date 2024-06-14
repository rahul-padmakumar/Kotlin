package com.example.kotlin.basics

fun main(){

    val a = "hello \"Developer\""
    println(a)

    val backslash = "hello \\ and /"
    println(backslash)

    val test1 = "Hello"
    println(test1.length)
    println(test1.replaceFirstChar { test1[0].lowercaseChar() })

    //trim
    println("  hello developer ".trim())

    // get characters
    println("Hello".get(3))
    println("Hello"[1])

    println("Encyclopedia".substring(4))
    println("Encyclopedia".substring(4, 7)) // end index not included

    println("Hello".reversed())
    //palindrome
    println("Malayalam".lowercase().reversed())

    println("malayalam".substringAfter("a"))
    println("malayalam".substringAfter("z",  "Not Found"))

    println("malayalam".drop(4))
    println("malayalam".dropLast(4))
    println("malayalam".dropWhile { it != 'a' })
    println("malayalam".dropLastWhile { it != 'l' })

    println("malayalam".codePointAt(1))
    val byteArray = "malayalam".encodeToByteArray()
    println(byteArray)
    println(byteArray.decodeToString())

    println("malayalam".endsWith("am"))

    // String templates
    val name = "TestDev"
    println("My test name is $name")

    // expression with string templates
    println(" 1 + 1 = ${1+1}")
}