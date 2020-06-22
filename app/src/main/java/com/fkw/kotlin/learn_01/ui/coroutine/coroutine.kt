package com.fkw.kotlin.learn_01.ui.coroutine

import kotlinx.coroutines.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

/**
 * 协程相关
 */
fun main() {
    //golbalscope()
    //runblock()
    //testLaunch()
    //highConcurrency()
    /*runBlocking {
        testSuspend()
    }*/
    //job1()
    //testAsync()
    //testWithContext()
    //testRunBlocking2()
    job2()
}

fun job2() {

    val job = Job()
    val scope = CoroutineScope(job)
    scope.launch {
        repeat(1000) { i ->
            println("job: I'm sleeping $i ...")
            delay(400)
        }
    }

}

fun testRunBlocking2() = runBlocking { // this: CoroutineScope
    launch {
        delay(200L)
        println("Task from runBlocking")
    }

    coroutineScope { // 创建一个协程作用域
        launch {
            delay(500L)
            println("Task from nested launch")
        }

        delay(100L)
        println("Task from coroutine scope") // 这一行会在内嵌 launch 之前输出
    }

    println("Coroutine scope is over") // 这一行在内嵌 launch 执行完毕后才输出
}

suspend fun <T> Call<T>.await(): T {
    return suspendCoroutine { continuation ->
        enqueue(object : Callback<T> {
            override fun onResponse(call: Call<T>, response: Response<T>) {
                val body = response.body()
                if (body != null) continuation.resume(body)
                else continuation.resumeWithException(RuntimeException("response body is null"))
            }

            override fun onFailure(call: Call<T>, t: Throwable) {
                continuation.resumeWithException(t)
            }
        })
    }
}


fun testWithContext() {
    runBlocking {
        val result = withContext(Dispatchers.Default) {
            delay(1000)
            5 + 4
        }
        println(result)
    }

}

fun testAsync() {
    runBlocking {
        val start = System.currentTimeMillis()
        val result = async() {
            delay(1000)
            5 + 5
        }.await()
        val result2 = async {
            delay(1000)
            3 + 2
        }.await()
        println(result + result2)

        val async1 = async {
            delay(1000)
            5 + 5
        }
        val async2 = async {
            delay(1000)
            5 + 5
        }
        println(async1.await() + async2.await())

        val end = System.currentTimeMillis()
        println(end - start)
    }
}

/**
 * 项目中的用法
 */
fun job1() {
    val job = Job()
    val scope = CoroutineScope(job)
    scope.launch {
        // todo
    }
    job.cancel()
}

/**
 * suspend关键字的测试
 */
suspend fun testSuspend() = coroutineScope {
    println(".")
    delay(1000)
}

/**
 * 10W个协程，运行时间是435毫秒
 */
fun highConcurrency() {
    val startTime = System.currentTimeMillis()
    runBlocking {
        repeat(100000) {
            println(".")
        }
    }
    val endTime = System.currentTimeMillis()
    println(endTime - startTime)

}

fun testLaunch() {

    runBlocking {
        launch {
            println("launch1" + Thread.currentThread().name)
            delay(500)
            println("launch1 finished" + Thread.currentThread().name)
        }
        launch {
            println("launch2" + Thread.currentThread().name)
            delay(1000)
            println("launch2 finished" + Thread.currentThread().name)

        }
    }
}

fun runblock() {
    runBlocking {
        println("codes run in coroutine scope")
        delay(1500)
        println("codes run in coroutine scope end")
    }
    Thread.sleep(1200)
}

private fun golbalscope() {
    GlobalScope.launch {
        println("codes run in coroutine scope")
        delay(1500)
        println("codes run in coroutine scope end")
    }
    Thread.sleep(1200)
}