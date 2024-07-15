package com.example.kotlin.classes_basics

fun main(){
    InitBlockBasics()
    InitBlockBasics("hello")
}


/**
 * Init block will be always treated as part of primary constructor, Will be executed before secondary constructor
 */
class InitBlockBasics(){

    init {
        println("Init block1")
    }

    init {
        println("Init block2")
    }

    constructor(message: String): this(){
        println("Secondary constructor")
    }
}