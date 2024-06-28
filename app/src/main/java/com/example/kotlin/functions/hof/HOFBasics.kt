package com.example.kotlin.functions.hof

fun main(){

    // higher order invocation with lambda
    printWelcomeMessage(listOf("Anna", "Bob", "Carol"), { println(it) })
    // higher order invocation wth anonymous function
    printWelcomeMessage(setOf("Jan", "Feb", "Mar"), fun(value){ println(value) })
    // trailing lambda if function type is last parameter of function
    printWelcomeMessage(listOf("Apr", "May", "June")){//parameter can be obtained using it if there is only one parameter
        println(it)
    }
}

fun printWelcomeMessage(collection: Collection<String>, printFunc: (String) -> Unit){
    collection.forEach {
        printFunc(it)
    }
}