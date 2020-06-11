package com.fkw.kotlin.learn_01.ui.frag

import kotlin.random.Random

data class News(val title: String, val content: String)

/**
 * 模拟假的新闻数据
 */
fun getMockNewsData(): List<News> {
    var title: String
    var content: String
    val data = ArrayList<News>(20)
    for (index in 0..20) {
        title = "This is title $index"
        content = title.repeat(Random(10).nextInt() + index)
        data.add(News(title, content))
    }
    return data
}