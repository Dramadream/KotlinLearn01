package com.fkw.kotlin.learn_01.ui.frag

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fkw.kotlin.learn_01.R
import kotlinx.android.synthetic.main.activity_news.*

class NewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)
    }

    fun isTwoPane(): Boolean {
        return frag_news_content != null
    }
}