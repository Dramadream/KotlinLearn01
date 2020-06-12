package com.fkw.kotlin.learn_01.ui.frag

import java.io.Serializable
import java.lang.StringBuilder
import kotlin.random.Random

data class News(val title: String, val content: String) : Serializable

/**
 * 模拟假的新闻数据
 */
fun getMockNewsData(): List<News> {
    var title: String
    var content: String
    val data = ArrayList<News>(20)
    for (index in 1..20) {
        title = "This is title $index"
        content = title.repeat((1..20).random() + index)
        data.add(News(title, content))
    }
    return data
}

fun main() {
    val lettersCount = "d37fadjf12070123123*^%&^%".lettersCount()
    println(lettersCount)

    println(Money(5L) + 10L)

    println("1234" * 4)
}

// 下面是扩展函数和运算符重载的练习
fun String.lettersCount(): Int {
    var count = 0
    for (c in this) {
        if (c.isLetter()) {
            count++
        }
    }
    return count
}

class Money(val value: Long) {

    operator fun plus(money: Money): Money {
        return Money(value + money.value)
    }

    operator fun plus(value: Long): Money {
        return Money(value + this.value)
    }

    override fun toString(): String {
        return "Money(value=$value)"
    }

}

// 这里其实是重载了乘号运算符
operator fun String.times(n: Int): String {
    val sb = StringBuilder()
    repeat(n) {
        sb.append(this)
    }
    return sb.toString()
}