package com.example.kotlin.classes_basics.enums

/**
 * Oridinal enum - position represents the value
 *  Here each enum is an object
 */
private enum class CardType{
    SILVER,
    GOLD,
    PLATINUM
}

fun main(){
    println(CardType.GOLD)
    println(CardType.GOLD.name + ": ${CardType.GOLD.ordinal}")
    println(CardType.SILVER.name + ": ${CardType.SILVER.ordinal}")
    println(CardType.PLATINUM.name + ": ${CardType.PLATINUM.ordinal}")
    println(CardType.entries)
    println(CardType.valueOf("SILVER"))
}