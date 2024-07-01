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
    // Standard hofs like apply are marked as inline since we can use return with the lambda
    1.apply{
        return
    }
    // Without inline we will not be able to use return inside apply block
    /*1.apply1{
        return
    }*/
}

private fun operation(block: (Int, Int) -> Int){
    println(block(5, 3))
}

private inline fun operationInline(block: (Int, Int) -> Int){
    println(block(7, 7))
}

private fun <T> T.apply1(block: T.() -> Unit): T{
    block()
    return this
}
