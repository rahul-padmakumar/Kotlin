package com.example.kotlin.generics

import kotlin.random.Random

/**
 * Need to preserve the type & need to invoke member - generic parameter with constraints
 * Need to preserve the type & need not invoke member - generic parameter without constraints
 * Need not preserve the type & need to invoke members - Use abstraction like Pet instead of T
 * Need not preserve the type & need not invoke members- Use start projection or raw type in Java
 */

interface Pet{
    val name: String
}

class Dog(override val name: String): Pet

class Cat(override val name: String): Pet

fun <T: Pet> chooseFavoritePet(pets: List<T>){
    val fav = pets[Random.nextInt(pets.size)]
    println(fav.name)
}

fun main(){
    chooseFavoritePet(listOf(Dog("A"), Dog("B"), Cat("C")))
}