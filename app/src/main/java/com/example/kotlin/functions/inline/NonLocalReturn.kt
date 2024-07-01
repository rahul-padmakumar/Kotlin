package com.example.kotlin.functions.inline

fun main(){
   operation{a, b ->
       a + b
        // cannot use return here
   }
    operationInline { i, i2 ->
        if(i % 3 == 0) {
            return
        } else {
            i + i2
        }
    }
}

private fun operation(block: (Int, Int) -> Int){
    println(block(5, 3))
}

private inline fun operationInline(block: (Int, Int) -> Int){
    println(block(7, 7))
}
