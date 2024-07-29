package com.example.kotlin.extension

/**
 * Dispatch receiver can be dynamic
 * Extension receiver are static
 *
 * Visibility:
 * Extension function defined as top level can access private functions and variables defined in the same file
 * Extension function defined in separate file cannot access private and protected variables and functions in the receiver
 */
open class ExtInheritanceBase
class ExtInheritanceDerived: ExtInheritanceBase()

open class ExtInheritanceBaseCaller{
    open fun ExtInheritanceBase.printFunctionInfo() = println("Base extension function in base caller")

    open fun ExtInheritanceDerived.printFunctionInfo() = println("Derived extension function in base caller")

    fun call(base: ExtInheritanceBase){
        base.printFunctionInfo()
    }
}
class ExtInheritanceDerivedCaller: ExtInheritanceBaseCaller(){
    override fun ExtInheritanceBase.printFunctionInfo() {
        println("Base extension function in derived caller")
    }

    override fun ExtInheritanceDerived.printFunctionInfo() {
        println("Derived extension function in derived caller")
    }
}

fun main(){
    val baseCaller = ExtInheritanceBaseCaller()
    baseCaller.call(ExtInheritanceBase())
    baseCaller.call(ExtInheritanceDerived())
    with(ExtInheritanceDerivedCaller()){
        call(ExtInheritanceBase())
        call(ExtInheritanceDerived())
    }
}
