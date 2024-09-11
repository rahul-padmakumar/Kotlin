package com.example.kotlin.practise_samples

fun main(){

    val indexPairs1 = twoSum(intArrayOf(2, 7, 11, 5), 9)
    println("[${indexPairs1.first}, ${indexPairs1.second}]")

    val indexPairs2 = twoSum(intArrayOf(3, 2, 4), 6)
    println("[${indexPairs2.first}, ${indexPairs2.second}]")

    val indexPairs3 = twoSum(intArrayOf(3, 3), 6)
    println("[${indexPairs3.first}, ${indexPairs3.second}]")
}

fun twoSum(nums: IntArray, target: Int): Pair<Int, Int>{
    val map = mutableMapOf<Int, Int>()
    nums.forEachIndexed { index, i ->
        val diff = target - i
        if(map.contains(diff)){
            return Pair(map[diff]!!, index)
        }
        map[i] = index
    }
    return Pair(-1, -1)
}