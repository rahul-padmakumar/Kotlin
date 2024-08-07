package com.example.kotlin.classes_basics.objects_basics

interface ExpressionOperation<T>{
    fun execute(a: T, b: T): T
}

interface ExpressionPrintable<T>{
    fun print(data: T)
}

fun main(){

    val sum = object: ExpressionOperation<Int>{
        override fun execute(a: Int, b: Int): Int = a + b
    }
    val printableSum = object: ExpressionOperation<Double>, ExpressionPrintable<Double>{
        override fun execute(a: Double, b: Double) = a + b

        override fun print(data: Double) {
            println(data)
        }

    }
    println(sum::class.java)
    println(sum.execute(3, 4))
    printableSum.print(printableSum.execute(3.4, 2.5))
    val printable: ExpressionPrintable<Int> = object: ExpressionOperation<Int>, ExpressionPrintable<Int>{
        override fun execute(a: Int, b: Int): Int = a * b

        override fun print(data: Int) {
            println("Multiplication result: $data")
        }
    }
    printable.print(45)
}