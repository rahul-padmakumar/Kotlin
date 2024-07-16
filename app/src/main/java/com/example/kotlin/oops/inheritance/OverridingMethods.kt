package com.example.kotlin.oops.inheritance


fun main(){

    var shape: OverridingShape = OverridingTriangle()
    shape.draw()
    shape = OverridingShape()
    shape.draw()
    shape = OverridingQuadrilateral()
    shape.draw()
    shape = OverridingBox()
    shape.draw()
    shape = OverridingRect()
    shape.draw()

    val rectShape = OverridingRect()
    rectShape.drawRect()
    rectShape.draw()
}
open class OverridingShape{
    open fun draw(){
        println("draw shape")
    }

    fun fill(){
        println("Fill shape with dots")
    }
}

open class OverridingTriangle: OverridingShape(){
    override fun draw() {
        println("Draw triangle")
    }
}

open class OverridingQuadrilateral: OverridingShape(){
    override fun draw() {
        println("Draw qaud")
    }
}

/**
 * A member marked override is itself open, so it may be overridden in subclasses.
 * We can prohibit re-overriding by using final
 */
open class OverridingBox: OverridingQuadrilateral(){
    final override fun draw() {
        println("Draw box")
    }
}

open class OverridingRect: OverridingBox(){
    fun drawRect(){
        println("Draw Rect")
    }
}