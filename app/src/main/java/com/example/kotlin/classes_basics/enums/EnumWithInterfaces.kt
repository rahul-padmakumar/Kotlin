package com.example.kotlin.classes_basics.enums


interface ICardLimit{
    fun getCreditLimit(): Int
    fun getDebitLimitPerDay(): Int
}

private enum class CardTypeWithInterface: ICardLimit{
    SILVER{
        override fun getCreditLimit(): Int = 15000
    },
    GOLD{
        override fun getCreditLimit(): Int = 20000
    },
    PLATINUM{
        override fun getCreditLimit(): Int = 25000
    };

    override fun getDebitLimitPerDay(): Int = 20000
}

fun main(){
    CardTypeWithInterface.entries.forEach {
        println("Credit Limit: ${it.getCreditLimit()}, Debit Limit: ${it.getDebitLimitPerDay()}")
    }
}