package com.example.kotlin.oops.inheritance

open class SuperKeywordRectangle {
    open fun draw() = println("Draw rectangle")
}

class SuperKeywordFilledRectangle1: SuperKeywordRectangle(){
    override fun draw() {
        super.draw()
        println("Fill the rectangle")
    }
}

class SuperKeywordRectangle2: SuperKeywordRectangle(){
    override fun draw() {
       Filler().drawAndFill()
    }

    inner class Filler{
        fun drawAndFill(){
            super@SuperKeywordRectangle2.draw() // to access draw method of outer class's super class
            println("Fill the rectangle using dots")
        }
    }
}

fun main(){
    SuperKeywordFilledRectangle1().draw()
    SuperKeywordRectangle().draw()
    SuperKeywordRectangle2().draw()
}