package nam.vuthanh.myapplication

import kotlinx.coroutines.*

fun main() {
    println(Thread.currentThread().name)
    GlobalScope.launch(Dispatchers.Unconfined) {
        println(Thread.currentThread().name)
        sleepAndReturn()
    }
    println("end")
}

suspend fun sleepAndReturn() = withContext(Dispatchers.Default) {
    delay(10000L)
}