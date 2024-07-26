package com.example.kotlin.classes_basics.sealed_classes

import java.io.File


enum class ErrorSeverity {
    MINOR,
    MAJOR,
    CRITICAL
}
sealed class IOError{
    private constructor(severity: ErrorSeverity)

    class FileReadError(file: File): IOError(ErrorSeverity.CRITICAL)
    data class DatabaseError(val dbName: String): IOError(ErrorSeverity.MAJOR)

    data object UnknownError: IOError(ErrorSeverity.MINOR)
}

fun main(){
    listOf(
        IOError.FileReadError(File("hello")),
        IOError.DatabaseError("Title"),
        IOError.UnknownError
    ).forEach {
        println(it)
    }
}

