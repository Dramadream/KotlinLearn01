package com.fkw.kotlin.learn_01.ui.frag

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.fkw.kotlin.learn_01.R
import kotlinx.android.synthetic.main.frag_news_content.*

class NewsContentFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = layoutInflater.inflate(R.layout.frag_news_content, container, false)
        return view
    }


    fun refresh(news: News) {
        tv_news_title.text = news.title
        tv_news_content.text = news.content
    }
}