package com.example.kotlin.oops.encapsulation.pkg_b

import com.example.kotlin.oops.encapsulation.pkg_a.PkgAInternal

class PkgBInternalTest {

    private val testData = PkgAInternal()

    fun print(){
        println(testData.variable)
    }
}