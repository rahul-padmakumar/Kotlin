package com.example.kotlin.extension

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
