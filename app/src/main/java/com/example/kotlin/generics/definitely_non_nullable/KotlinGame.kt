package com.example.kotlin.generics.definitely_non_nullable

interface ArcadeGame<T1>: Game<T1>{
    override fun save(x: T1): T1 {
        return x
    }

    override fun load(x: T1 & Any): T1 {
        return x
    }
}