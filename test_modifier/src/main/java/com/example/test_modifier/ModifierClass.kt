package com.example.test_modifier

class ModifierClass {
    internal val b: Int = 0
    val c: Int = 10
    fun print() = println(ModifierClassA().d)
}

internal class ModifierClassA {
    val d: Int = 20
}