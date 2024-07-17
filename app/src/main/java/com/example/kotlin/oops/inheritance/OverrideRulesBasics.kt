package com.example.kotlin.oops.inheritance

open class OverrideRulesBasicsRectangle {
    open fun draw(){
        println("Draw Rectangle")
    }
}

interface OverrideRulesBasicsPolygon{
    fun draw(){
        println("Draw Polygon")
    }
}

class OverrideRulesBasicsSquare: OverrideRulesBasicsRectangle(), OverrideRulesBasicsPolygon{
    override fun draw() {
        super<OverrideRulesBasicsPolygon>.draw()
        super<OverrideRulesBasicsRectangle>.draw()
    }
}

fun main(){
    OverrideRulesBasicsSquare().draw()
}