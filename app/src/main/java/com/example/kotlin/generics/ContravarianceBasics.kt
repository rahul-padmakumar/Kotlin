package com.example.kotlin.generics

/**
 * In keyword for generic type if we need to assign it to reference of subtype.
 * The parameter type that is only consumed - parameter cannot be in publicly accessible variables
 * for eg:
 * class ParametrizedConsumer<in T>(val data: T) - not possible
 * class ParametrizedConsumer<in T>(private val data: T) - possible
 * Can be used as parameter type in functions.
 */

class ParametrizedConsumer<in T>{
    fun toString(value: T): String = value.toString()
}

fun main(){

    val parametrizedConsumer = ParametrizedConsumer<Number>()
    val ref: ParametrizedConsumer<Double> = parametrizedConsumer
    ref.toString(100.0)
    parametrizedConsumer.toString(100)
}