package com.example.kotlin.oops.encapsulation.pkg_a

private class PkgAPrivate {
    var variable: Int  = 0
}

class PkgAPrivateTest{
    private val testVariable: PkgAPrivate = PkgAPrivate()
    fun print(){
        println(testVariable.variable)
    }
}

fun main(){
    val pkgAPrivate = PkgAPrivate()
    println(pkgAPrivate.variable)
    PkgAPrivateTest().print()
}