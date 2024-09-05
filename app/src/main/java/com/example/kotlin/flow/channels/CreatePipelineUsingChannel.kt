@file:OptIn(ExperimentalCoroutinesApi::class)

package com.example.kotlin.flow.channels

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

@OptIn(ExperimentalCoroutinesApi::class)
fun CoroutineScope.produceNumbers(count: Int) = produce {
    repeat(count){
        send(it)
    }
}

fun CoroutineScope.filter(
    numbers: ReceiveChannel<Int>,
    predicate: (Int) -> Boolean
) = produce {
    numbers.consumeEach {
        if(predicate(it)){
            send(it)
        }
    }
}

fun CoroutineScope.square(
    numbers: ReceiveChannel<Int>
) = produce {
    numbers.consumeEach {
        send(it * it)
    }
}

fun CoroutineScope.pipeline(
    numbers: ReceiveChannel<Int>
) = produce {
    square(filter(numbers, {it % 2 != 0})).consumeEach {
        send(it)
    }
}

fun main(){
    runBlocking {
        var channel: ReceiveChannel<Int> = Channel {  }
        launch {
            channel = pipeline(produceNumbers(10))
        }
        launch {
            channel.consumeEach {
                println("Result is: $it")
            }
        }
    }
}
