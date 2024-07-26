package com.example.kotlin.classes_basics.enums

sealed interface IEnumError

enum class EnumError: IEnumError{
    FILE_ERROR,
    DATABASE_ERROR
}

fun main(){
    val error: IEnumError = EnumError.FILE_ERROR
    println(error)
    EnumError.entries.forEach {
        println(it)
    }
}