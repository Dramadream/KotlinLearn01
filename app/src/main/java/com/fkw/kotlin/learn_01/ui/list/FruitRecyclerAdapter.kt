package com.fkw.kotlin.learn_01.ui.list

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class FruitRecyclerAdapter(val data: List<Fruit>) :
    RecyclerView.Adapter<FruitRecyclerAdapter.Holder>() {

    inner class Holder(view: View) : RecyclerView.ViewHolder(view) {

    }

    init {

    }

    override fun getItemCount(): Int = data.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {

        return Holder(view)
    }


    override fun onBindViewHolder(holder: Holder, position: Int) {
        TODO("Not yet implemented")
    }
}