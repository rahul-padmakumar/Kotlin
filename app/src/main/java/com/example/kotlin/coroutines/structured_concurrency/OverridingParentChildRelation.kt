package com.example.kotlin.coroutines.structured_concurrency

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * Job hierarchy can be overridden by two ways:
 * -> Passing new job object
 * -> Using Global Scope.
 */
fun main(){
    runBlocking {
        val parentJob = Job()
        val scope = CoroutineScope(parentJob)

        var job2: Job? = null
        var job3: Job? = null
        var job4: Job? = null
        var job5: Job? = null
        var job6: Job? = null

        val job1 = scope.launch {
            delay(1000)
            job2 = launch(Job()) {
                delay(1200)
            }
            job3 = scope.launch(Job()) {
                delay(13000)
            }
            job4 = CoroutineScope(Job()).launch {
                delay(1200)
            }
            job5 = CoroutineScope(this.coroutineContext).launch {
                delay(1300)
            }
            job6 = GlobalScope.launch {
                delay(1400)
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
        println("job4 child of parent: ${parentJob.children.contains(job4)}")
        delay(200)
        println("job5 child of job1: ${job1.children.contains(job5)}")
        println("job5 is active: ${job5?.isActive}")
        println("job6 child of parent: ${parentJob.children.contains(job6)}")
        println("Is job1 and parent same: ${job1 === parentJob}")
        println("job1 child of runBlocking: ${this.coroutineContext[Job]?.children?.contains(job1)}")
    }
}