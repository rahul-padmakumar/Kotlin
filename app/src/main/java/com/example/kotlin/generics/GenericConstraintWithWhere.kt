package com.example.kotlin.generics

import kotlin.random.Random

interface Named{
    val name: String
}
interface Species{
    val species: String
}

class WhereDog(
    override val name: String, override val species: String
): Named, Species

class WhereCat(
    override val name: String
): Named

fun <T> chooseFavorite(pets: List<T>) where T: Named, T: Species{
    val favorite = pets[Random.nextInt(pets.size)]
    println("favorite pet is ${favorite.name} and species is ${favorite.species}")
}

fun main(){
    chooseFavorite(listOf(WhereDog("a", "dog"), WhereDog("b", "dog")))
}
