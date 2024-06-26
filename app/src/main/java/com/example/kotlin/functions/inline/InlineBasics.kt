package com.example.kotlin.functions.inline

import kotlin.system.measureTimeMillis

/**
 * Decoded byte code
 * public static final void main() {
 *       String var0 = "main start";
 *       System.out.println(var0);
 *       foo((Function0)null.INSTANCE);
 *       int $i$f$fooInline = false;
 *       int var1 = false;
 *       String var2 = "foo inline block";
 *       System.out.println(var2);
 *       var0 = "main end";
 *       System.out.println(var0);
 *    }
 *  As clear from above byte code fooInline code is placed at the call site that is main function
 *  Also when inlining compiler dont need to create an object of Fucntion0 which is required when lambda is not inline.
 */

fun main(){
    println("main start")
    val times = measureTimeMillis {
        repeat(1_000) {
            foo {
                print("foo block")
            }
        }
    }
    println("time taken is $times")
    val times2 = measureTimeMillis {
        repeat(1_000) {
            fooInline {
                print("foo inline block")
            }
        }
    }
    println("time taken is $times2")
    println("main end")
}

private fun foo(block: () -> Unit){
    block()
}

private inline fun fooInline(block: () -> Unit){
    block()
}