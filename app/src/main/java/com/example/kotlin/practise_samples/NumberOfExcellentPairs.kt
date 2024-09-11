package com.example.kotlin.practise_samples

fun main(){

    println(countExcellentNumbers(intArrayOf(1, 2, 3, 1), 3))
    println(countExcellentNumbers(intArrayOf(5, 1, 1), 10))
}

fun countExcellentNumbers(nums: IntArray, k: Int): Int{
    val set = mutableSetOf<Pair<Int, Int>>()
    val setBitCounts = nums.map {
        countSetBits(it)
    }
    for(i in nums.indices){
        for (j in nums.indices){
            if(setBitCounts[i] + setBitCounts[j] >= k){
                set.add(Pair(nums[i], nums[j]))
            }
        }
    }
    return set.size
}

fun countSetBits(number: Int): Int{
    var count = 0
    var temp = number
    while (temp > 0){
        count += temp and 1
        temp = temp shr 1
    }
    return count
}