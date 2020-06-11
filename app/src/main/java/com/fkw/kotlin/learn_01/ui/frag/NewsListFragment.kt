package com.fkw.kotlin.learn_01.ui.frag

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.fkw.kotlin.learn_01.R
import kotlinx.android.synthetic.main.frag_news_list.*

class NewsListFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = layoutInflater.inflate(R.layout.frag_news_list, container, false)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val data = getMockNewsData()
        rv_news_list.layoutManager = LinearLayoutManager(activity)

    }

}