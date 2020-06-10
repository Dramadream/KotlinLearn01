package com.fkw.kotlin.learn_01.ui.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.fkw.kotlin.learn_01.R

class FruitRecyclerAdapter(val data: List<Fruit>) :
    RecyclerView.Adapter<FruitRecyclerAdapter.Holder>() {

    inner class Holder(view: View) : RecyclerView.ViewHolder(view) {
        val iv: ImageView = view.findViewById(R.id.iv_fruit)
        val tv: TextView = view.findViewById(R.id.tv_fruit)
    }

    init {

    }

    override fun getItemCount(): Int = data.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_fruit, parent, false)
        return Holder(view)
    }


    override fun onBindViewHolder(holder: Holder, position: Int) {
        val fruit = data[position]
        holder.iv.setImageResource(fruit.picId)
        holder.tv.text = fruit.name
    }
}