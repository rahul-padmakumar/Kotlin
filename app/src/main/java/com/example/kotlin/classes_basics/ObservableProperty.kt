package com.example.kotlin.classes_basics

import kotlin.properties.ObservableProperty
import kotlin.reflect.KProperty

class CustomObservableProperty: ObservableProperty<Int>(10){
    override fun afterChange(property: KProperty<*>, oldValue: Int, newValue: Int) {
        super.afterChange(property, oldValue, newValue)
        println("after old value is $oldValue and new value is $newValue")
    }

    override fun beforeChange(property: KProperty<*>, oldValue: Int, newValue: Int): Boolean {
        println("before old value is $oldValue and new value is $newValue")
        return super.beforeChange(property, oldValue, newValue)
    }
}

class ObProperty{
    var value: Int by CustomObservableProperty()
}

fun main(){
    val obj = ObProperty()
    obj.value = 10
    obj.value = 20
}
