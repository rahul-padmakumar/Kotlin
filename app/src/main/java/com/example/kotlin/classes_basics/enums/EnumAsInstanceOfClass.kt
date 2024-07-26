package com.example.kotlin.classes_basics.enums

private enum class CardTypeInstance(val color: String){
    SILVER("gray"),
    GOLD("yellow"),
    PLATINUM("black");

    companion object{
        fun getCardTypeFromColor(color: String) = CardTypeInstance.entries.find {
            it.color == color
        }
    }
}

fun main(){

    val color = CardTypeInstance.GOLD.color
    println(color)
    val enm1: CardTypeInstance = CardTypeInstance.valueOf("SILVER")
    println(enm1.name)
    println(enm1.color)
    println(enm1.ordinal)
    println(CardTypeInstance.getCardTypeFromColor("black"))
}