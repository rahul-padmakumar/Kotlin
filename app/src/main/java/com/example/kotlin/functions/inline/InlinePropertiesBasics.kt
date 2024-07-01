package com.example.kotlin.functions.inline

fun main(){

    println(ArithmeticOperation().sum(1, 3))
    val rect = Rectangle(10, 9)
    println(rect.area)
    println(rect.perimeter)
    val person = Person()
    person.votingAge = 19
    println(person.votingAge)
    person.votingAge = 12
    person.marryingAge = 19
    println(person.marryingAge)
}

private class ArithmeticOperation {
    inline val sum
        get() = {a: Int, b: Int -> a + b}
}

private class Rectangle(private val width: Int, private val height: Int){
    val area
        inline get() = width * height

    inline val perimeter
        get() = 2 * width * height
}

private class Person {

    var votingAge
        get() = 18
        inline set(value){
            if(value > 18){
                println("He can vote")
            } else {
                println("He can vote after ${18 - value} years")
            }
        }

    var marryingAge
        inline get() = 21
        set(value){
            if(value > 21){
                println("He can marry")
            } else {
                println("He can marry after ${21 - value} years")
            }
        }
}