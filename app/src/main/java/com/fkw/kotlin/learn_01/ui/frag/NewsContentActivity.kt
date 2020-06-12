package com.fkw.kotlin.learn_01.ui.frag

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fkw.kotlin.learn_01.R
import kotlinx.android.synthetic.main.activity_news_content.*

class NewsContentActivity : AppCompatActivity() {


    companion object {
        private const val EXTRA_NEWS = "extra_news"

        fun actionStart(context: Context, news: News) {
            Intent(context, NewsContentActivity::class.java).apply {
                putExtra(EXTRA_NEWS, news)
                context.startActivity(this)
            }

        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_content)

        val news = intent.getSerializableExtra(EXTRA_NEWS) as News
        (frag_news_content as NewsContentFragment).refresh(news)
    }
}