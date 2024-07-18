package com.example.kotlin.oops.abstraction_basics

abstract class AbstractClasAnimal {
    abstract fun sound()
    fun sleep() {
        println("ZZZ")
    }
}

class AbstractDog: AbstractClasAnimal(){
    override fun sound() {
        println("Bow! Bow!")
    }

}

class AbstractCat: AbstractClasAnimal(){
    override fun sound() {
        println("Meow# Meow#")
    }
}

fun main(){

    var animal: AbstractClasAnimal = AbstractDog()
    animal.sound()
    animal.sleep()
    animal = AbstractCat()
    animal.sleep()
    animal.sound()
    animal = object: AbstractClasAnimal(){
        override fun sound() {
            println("Random Quack")
        }
    }
    animal.sleep()
    animal.sound()
}