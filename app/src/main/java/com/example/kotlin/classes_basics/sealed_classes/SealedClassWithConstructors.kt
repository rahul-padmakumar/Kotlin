package com.example.kotlin.classes_basics.sealed_classes

sealed class ErrorConstructor(val message: String){
    class NetworkError: Error("Network Failure")
    class DataBaseError: Error("Database Failure")

    object UnknownError: Error("Unknown Error Occurred")
}

fun main(){
    val errors = listOf(
        ErrorConstructor.NetworkError(),
        ErrorConstructor.DataBaseError(),
        ErrorConstructor.UnknownError
    )
    errors.forEach {
        println(it.message)
    }
}