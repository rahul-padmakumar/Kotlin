package com.example.kotlin.generics

/**
 * Covariance - the generic can be used only as output and cannot be modified.
 * val producer2: ParametrizedProducer<Number> = producer
 * supertype can be used in place of subtype
 *
 */
class ParametrizedProducer<out T>(private val value: T){
    fun getValue(): T = value
}

fun main(){
   val producer = ParametrizedProducer(30.0)
    val producer2: ParametrizedProducer<Number> = producer
    println(producer2.getValue())
}
