package com.example.kotlin.classes_basics

import com.example.kotlin.classes_basics.sealed_classes.UIState

//class FileError(val message: String): UIState() - not possible

class FileError(val message: String): UIState.Error()

fun main(){
    listOf(
        UIState.Success("Hello"),
        UIState.Error(),
        FileError("File Error")
    ).forEach {
        when(it){
            is UIState.Error -> {
                when(it){
                    is FileError -> println(it.message)
                    else -> println("Error")
                }
            }
            is UIState.Success -> println(it.data)
        }
    }
}