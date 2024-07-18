package com.example.kotlin.interface_basics

interface FanInterface{

    val rpm: Int

    val topSpeed: Int
        get() = 3

    fun turnOn()

    fun turnOff(){
        println("Turn fan off")
    }

    fun changeSpeed(speed: Int)
}

class OrientalFan(override val rpm: Int) : FanInterface{

    override val topSpeed: Int
        get() = 5

    override fun turnOn() {
        println("Turn on the fan")
    }

    override fun changeSpeed(speed: Int) {
        val currentSpeed  = if(speed > topSpeed){
            topSpeed
        } else speed

        println("Fan's current speed is $currentSpeed and rpm is $rpm")
    }

}

fun main(){
    val fan = OrientalFan(1300)
    fan.turnOn()
    fan.changeSpeed(4)
    fan.turnOff()
}