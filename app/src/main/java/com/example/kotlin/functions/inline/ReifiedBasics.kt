package com.example.kotlin.functions.inline

fun main(){
   listOf(1,"Hello", 3.5, 2, "Hi").filterWith<String>().forEach {
       println(it)
   }
}

/**
 * reified - is to know the exact type that the type parameter T represents at runtime.
 */
private inline fun <reified T> List<Any>.filterWith() = this.filter {
    it is T
}