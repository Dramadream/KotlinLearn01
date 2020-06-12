package com.fkw.kotlin.learn_01.ui.frag

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fkw.kotlin.learn_01.R
import kotlinx.android.synthetic.main.activity_news.*
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

        val newsListAdapter = NewsListAdapter(data)
        newsListAdapter.isTwoPane = (activity as NewsActivity).isTwoPane()

        rv_news_list.adapter = newsListAdapter
    }

    inner class NewsListAdapter(val data: List<News>) : RecyclerView.Adapter<NewsListAdapter.Holder>() {

        var isTwoPane = false


        override fun getItemCount() = data.size

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsListAdapter.Holder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_news_list, parent, false)
            return Holder(view)
        }


        override fun onBindViewHolder(holder: NewsListAdapter.Holder, position: Int) {
            holder.tvNewsTitle.text = data[position].title
            holder.itemView.setOnClickListener {
                if (isTwoPane) {
                    val newsContentFragment = frag_news_content as NewsContentFragment
                    newsContentFragment.refresh(data[position])
                } else {
                    NewsContentActivity.actionStart(holder.itemView.context, data[position])
                }
            }
        }

        inner class Holder(val view: View) : RecyclerView.ViewHolder(view) {
            val tvNewsTitle = view.findViewById<TextView>(R.id.tv_news_title)
        }


    }
}