package com.example.kotlin.oops.inheritance

open class DerivedClassInitializationFlowBase(val name: String) {
    init {
        println("Initialising the base class")
    }

    open val size = name.length.also { println("Size evaluated in base class") }
}

class DerivedClassInitializationFlowDerived(name: String, lastName: String):
    DerivedClassInitializationFlowBase(
        name.replaceFirstChar { name[0].uppercase() }.also {
            println("Derived class constructor")}){
        init {
            println("Initialising the derived class")
        }

        override val size: Int = (name.length + lastName.length).also {
            println("Size evaluated in derived class")
        }
    }

fun main(){
    DerivedClassInitializationFlowDerived(
        "Tester",
        "Dev"
    )
}