package com.example.kotlin.extension

fun <T> MutableList<T>?.toStringWithIndex(){
    if(this == null){
        println("Null!!!")
    } else {
        this.forEachIndexed { index, t ->
            println("$index: $t")
        }
    }
}

fun main(){
    var list: MutableList<Int>? = null
    list.toStringWithIndex()
    list = mutableListOf(1, 2, 3)
    list.toStringWithIndex()
}