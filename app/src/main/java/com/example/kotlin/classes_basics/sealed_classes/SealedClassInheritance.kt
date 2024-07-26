package com.example.kotlin.classes_basics.sealed_classes

sealed class UIState{
    data class Success(val data: String): UIState()
    open class Error(): UIState()
}