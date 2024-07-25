package com.example.kotlin.classes_basics

/**
 * Rules:
 *  - Needs atleast one parameter in the primary constructor
 *  - Parameter in the constructor needs to be marked as val or var
 *  - Cannot be abstract, open, sealed or inner
 *
 *  Properties:
 *  - provides default implementation for equals, hashcode, toString and ComponentN using parameters in the constructors
 */
private data class PersonDataClass(
    val personName: String,
    val age: Int
){
    var salary: Int = 1000
}

fun main(){
    val p1 = PersonDataClass("Test", 50)
    val p2 = PersonDataClass("Test", 50).apply {
        salary = 2000
    }
    println("Is both person same: ${p1 == p2}")
    println(p1.toString())
    println(p2.toString())
    val p3 = p2.copy(age = 55)
    println(p3.toString())
    val (name, age) = p3
    println("Name = $name, age = $age")

    //Standard data classes:
    val pair = Pair("Test", "QA")
    println(pair)
    println("First in pair: ${pair.first}")
    println("Second in pair: ${pair.second}")
    val triple = Triple("Test", "QA", 100)
    println(triple)
    println("First in triple: ${triple.first}")
    println("Second in triple: ${triple.second}")
    println("Third in triple: ${triple.third}")
}