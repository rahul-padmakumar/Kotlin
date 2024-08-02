package com.example.kotlin.basics

import kotlin.random.Random

interface CastAnimal

class CastDog: CastAnimal{
    fun bark(){
        println("Dog Barks")
    }
}

class CastCat: CastAnimal{
    fun purr(){
        println("Cat purrs")
    }
}

fun main(){
    val list = mutableListOf<CastAnimal>().apply {
        for(i in 1..10){
           add(
               if(Random.nextInt() % 2 == 0){
                   CastDog()
               } else CastCat()
           )
        }
    }
    list.forEach {
        (it as? CastDog)?.bark()
        (it as? CastCat)?.purr()
    }
}