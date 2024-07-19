package com.example.kotlin.functions.standard_functions

fun main(){

    val vehicleList = listOf("Zen", "Accent", "Aspire")
    vehicleList.filter {
        it.length > 3
    }.let {
        println(it.size)
        println(it)
    }

    vehicleList.map { it.length }.customLet {
        println(it)
    }
}

private inline fun <T, R> T.customLet(block: (T) -> R): R{
    return block(this)
}