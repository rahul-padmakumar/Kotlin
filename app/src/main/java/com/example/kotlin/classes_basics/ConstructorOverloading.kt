package com.example.kotlin.classes_basics

class PersonData(){

    private var height: Int = 100
    private var weight: Int = 10

    constructor(weight: Int) : this() {
        this.weight = weight
    }

    constructor(weight: Int, height: Int): this(){
        this.weight = weight
        this.height = height
    }

    fun print(){
        println("The person has weight: $weight and height: $height")
    }
}

fun main(){
    val p1 = PersonData()
    p1.print()
    val p2 = PersonData(weight = 20)
    p2.print()
    val p3 = PersonData(weight = 100, height = 173)
    p3.print()
}