package com.example.kotlin.interface_basics

private interface A{
    fun foo(){
        println("A foo")
    }
    fun bar()
}
private interface B{
    fun foo(){
        println("B foo")
    }

    fun bar(){
        println("B bar")
    }
}

class C: A, B{
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super.bar()
    }
}

fun main(){
    val c = C()
    c.foo()
    c.bar()
}