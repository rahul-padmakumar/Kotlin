package com.example.kotlin.functions.inline

/**
 * By default all parameters of inline functions are inlined
 * if we need to make some exceptional we can use noInline
 */
fun main(){
    takeClass()
    takeClass2()
}

/**
 * String var0 = "Start class";
 *       System.out.println(var0);
 *       Function0 subj2$iv = (Function0)null.INSTANCE;
 *       int $i$f$teachNoInline = false;
 *       int var2 = false;
 *       String var3 = "history";
 *       System.out.println(var3);
 *       subj2$iv.invoke();
 *       var0 = "End class";
 *       System.out.println(var0);
 *
 *  from above decompiled code first argument is called as inline while second argument is called as a normal function
 */
private fun takeClass2() {
    println("Start class")
    teachNoInline(
        { println("history") },
        { println("Physics") }
    )
    println("End class")
}


/**
 * public static final void takeClass() {
 *       String var0 = "Start class";
 *       System.out.println(var0);
 *       int $i$f$teach = false;
 *       int var1 = false;
 *       String var2 = "history";
 *       System.out.println(var2);
 *       var1 = false;
 *       var2 = "Physics";
 *       System.out.println(var2);
 *       var0 = "End class";
 *       System.out.println(var0);
 *    }
 *    Both parameters are inlined
 */
private fun takeClass(){
    println("Start class")
    teach(
        { println("history") },
        { println("Physics") }
    )
    println("End class")
}

private inline fun teach(subj1: () -> Unit, subj2: () -> Unit){
    subj1()
    subj2()
}
private inline fun teachNoInline(subj1: () -> Unit, noinline subj2: () -> Unit){
    subj1()
    subj2()
}


