package com.example.kotlin.extension

// Extension receiver
class Host(private val hostName: String){
    fun printHostName() = print("Host name: $hostName")
}

// Dispatch Receiver
class Connection(private val host: Host, private val port: Int){

    private fun printPort() = println("Port number: $port")

    private fun Host.printConnection(){
        printHostName()
        printPort()
        println(toString())
        println(this@Connection.toString())
    }

    fun connect(){
        host.printConnection()
    }
}

fun main(){
    Connection(Host("google.com"), port = 1234).connect()
}
