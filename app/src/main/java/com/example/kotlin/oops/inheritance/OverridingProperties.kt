package com.example.kotlin.oops.inheritance

fun main(){
    println(OverridingPropertiesShape().vertices)
    println(OverridingPropertiesTriangle().vertices)
    println(OverridingPropertiesSquare(4).vertices)
    println(OverridingPropertiesTriangleIF().vertices)
    println(OverridingPropertiesSquareIF(4).vertices)
}

open class OverridingPropertiesShape{
    open val vertices: Int  = 0
}

class OverridingPropertiesTriangle: OverridingPropertiesShape(){
    override val vertices: Int
        get() = 3
}

class OverridingPropertiesSquare(override val vertices: Int): OverridingPropertiesShape()

interface OverridingPropertiesShapeIF{
     val vertices: Int
}

class OverridingPropertiesTriangleIF: OverridingPropertiesShapeIF{
    override val vertices: Int
        get() = 3

}

class OverridingPropertiesSquareIF(
    override val vertices: Int
): OverridingPropertiesShapeIF

