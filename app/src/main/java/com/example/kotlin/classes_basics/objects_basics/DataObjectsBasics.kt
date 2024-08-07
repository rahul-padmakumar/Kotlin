package com.example.kotlin.classes_basics.objects_basics

/**
 * DataObject - provides toString(), equals and hashcode implementation and toString prints the name
 * of the data object.
 * Difference between data object and data class -
 *  data object does not override copy and componentN function
 */
class DataObjectsBasics {
    data class DataClassSample(val value: String)
    data object DataObject

    object ObjectExample

    fun print(){
        println(DataClassSample("Hello"))
        println(DataObject)
        println(ObjectExample)
    }
}

fun main(){
    DataObjectsBasics().print()
}