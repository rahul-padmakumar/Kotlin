package com.example.kotlin.classes_basics

object DataBaseConnector {
    var connected: Boolean = false
    fun connect(){
        connected = true
    }

    fun disconnect(){
        connected = false
    }
}

fun main(){
    println(DataBaseConnector.connected)
    DataBaseConnector.connect()
    println(DataBaseConnector.connected)
    DataBaseConnector.disconnect()
    println(DataBaseConnector.connected)
}
