package com.example.kotlin.oops.encapsulation

import com.example.test_modifier.ModifierClass

open class ClassMemberModifierBase {

    val a: Int = 10
    private val b: Int = 20
    protected val c: Int = 30
    internal  val d: Int = 40
}

class ClassMemberModifierExtended: ClassMemberModifierBase(){
    fun print(){
        println("d = ${super.d}, c = ${super.c}, a = ${super.a}")
    }
}

class ClassMemberModifierTest(){
    private val classMemberModifierBase = ClassMemberModifierBase()

    fun print(){
        println("a = ${classMemberModifierBase.a}, d = ${classMemberModifierBase.d}")
    }
}

fun main(){
    ClassMemberModifierExtended().print()
    ClassMemberModifierTest().print()
    println(ModifierClass().c)
    println(ModifierClass().print())
}