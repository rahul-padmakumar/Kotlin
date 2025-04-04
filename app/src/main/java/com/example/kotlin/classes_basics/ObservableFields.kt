package com.example.kotlin.classes_basics

import kotlin.properties.Delegates

class ObservableFields(val value: Int) {
    var observedValue: Int by Delegates.observable(value){ _, oldValue, newValue ->
        println("Old value is $oldValue and new value is $newValue")
    }
}

fun main(){
   val value = ObservableFields(10)
    value.observedValue = 20
    value.observedValue = 25
}