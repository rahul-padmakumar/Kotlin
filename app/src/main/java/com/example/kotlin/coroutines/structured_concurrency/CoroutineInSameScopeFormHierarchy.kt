package com.example.kotlin.coroutines.structured_concurrency

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * Job of launch becomes child of job passed in launch or if nothing passed job in scope will be from parent so becomes child of parent
 */
fun main(){
    runBlocking {
        val parentJob = Job()
        val scope = CoroutineScope(parentJob)

        var job2: Job? = null
        var job3: Job? = null

        val job1 = scope.launch {
            delay(1000)
            job2 = launch {// job 2 child of job1
                delay(1200)
            }
            job3 = scope.launch {// job3 child of parent since job passed in scope is parentJob
                delay(13000)
            }
        }

        println("job1 child of parent: ${parentJob.children.contains(job1)}")
        println("job1 is active: ${job1.isActive}")
        job1.children.forEach {
            println("Job 1 child: $it")
        }

        delay(1000)

        println("job1 is active: ${job1.isActive}")
        println("job2 is active: ${job2?.isActive}")
        println("job2 child of parent: ${parentJob.children.contains(job2)}")
        println("job2 child of job1: ${job1.children.contains(job2)}")
        println("job2 child of job1: ${job1.children.contains(job3)}")
        println("job3 child of parent: ${parentJob.children.contains(job3)}")
        println("Is job1 and parent same: ${job1 === parentJob}")
        println("job1 child of runBlocking: ${this.coroutineContext[Job]?.children?.contains(job1)}")
    }
}