package com.fkw.kotlin.learn_01.ui.frag

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fkw.kotlin.learn_01.R

class NewsListAdapter(val data: List<News>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount() = data.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_news_list, parent, false)
        return Holder(view)
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    inner class Holder(val view: View) : RecyclerView.ViewHolder(view) {

    }


}