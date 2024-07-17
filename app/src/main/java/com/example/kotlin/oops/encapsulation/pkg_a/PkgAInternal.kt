package com.example.kotlin.oops.encapsulation.pkg_a

internal class PkgAInternal {
    val variable: Int = 10
}

class PkgAInternalTestPrivate{
    private val data = PkgAInternal()

    fun print(){
        println(data.variable)
    }
}

fun main(){
    println(PkgAInternal().variable)
    println(PkgAInternalTestPrivate().print())
}