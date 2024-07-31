package com.example.kotlin.generics

class TypeProjectionExample<T>(private var data: T){
    fun accept(data: T){
        this.data = data
        println(data.toString())
    }
    fun provide(): T = data

    fun doSomething(): String = "$data Do Something"
}

fun <T> examine(data: TypeProjectionExample<out T>){
    val out = data.provide()
    println(out)
    //out.accept(data)
    println(data.doSomething())
}

fun <T> insert(data: TypeProjectionExample<in T>, input: T){
    val out = data.provide()
    println(out)
    //out is of type any?
    data.accept(input)
    println(data.doSomething())
}

fun starred(data: TypeProjectionExample<*>){
    val out = data.provide()
    println(out)
    // data accept will only accept nothing
    println(data.doSomething())
}

fun main(){
    val data = TypeProjectionExample<String>("Hello")
    examine(data)
    insert(data, "Hi!!!!")
    starred(data)
}