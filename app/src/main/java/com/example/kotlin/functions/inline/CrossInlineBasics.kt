package com.example.kotlin.functions.inline

fun main(){
    takeClass()
    takeClass2()
    takeClass3()
}

fun takeClass3() {
    println("Start class")
    teach4 {
        println("History")
    }
    println("End class")
}

/**
 * String var0 = "Start class";
 *       System.out.println(var0);
 *       int $i$f$teach = false;
 *       int var1 = false;
 *       String var2 = "History";
 *       System.out.println(var2);
 *
 *  Where is End class print statement
 *  above is an example of non local return issue
 *  to solve this we need cross_inline
 */
private fun takeClass(){
    println("Start class")
    teach {
        println("History")
        return
    }
    println("End class")
}

private inline fun teach(subj1: () -> Unit){
    subj1()
}

private fun takeClass2(){
    println("Start class")
    teach1 {
        println("History")
        //return - will generate compile time error
    }
    println("End class")
}

private inline fun teach1(crossinline subj1: () -> Unit){
    subj1()
}

/**
 * Inline function can be used inside inline functions only
 * if we intend to use parameter of inline function in non-inline function
 * we need cross inline
 */
/*private inline fun teach3(lesson1: () -> Unit){
    subj {
        lesson1()
    }
}*/

private inline fun teach4(crossinline lesson1: () -> Unit){
    subj {
        lesson1()
    }
}

private fun subj(lesson1: () -> Unit){
    lesson1()
}