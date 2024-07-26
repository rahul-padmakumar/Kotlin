package com.example.kotlin.classes_basics.enums

private enum class CardTypeAsAnonymousClass{
    SILVER {
        override fun calculateCashbackPercent(): Float = 0.2f
    },
    GOLD {
        override fun calculateCashbackPercent(): Float = 0.3f
    },
    PLATINUM {
        override fun calculateCashbackPercent(): Float = 0.5f
    };

    abstract fun calculateCashbackPercent(): Float
}

fun main(){
    CardTypeAsAnonymousClass.entries.forEach {
        println("Cashback percent for $it is: ${it.calculateCashbackPercent()}")
    }
}