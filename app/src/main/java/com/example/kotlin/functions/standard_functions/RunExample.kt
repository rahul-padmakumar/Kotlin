package com.example.kotlin.functions.standard_functions

/**
 * Use - Object configuration and return result
 */
fun main(){
   val evenNumberLst =  mutableListOf(1, 2, 3, 4, 5, 6).run {
       removeIf { it % 2 != 0  }
       println("Inside run - $this")
       this
   }.runExample {
       removeIf { it % 3 == 0 }
       println(this)
       map { it * it }
   }
    println(evenNumberLst)
}

private inline fun <T, R> T.runExample(block: T.() -> R): R = this.block()
