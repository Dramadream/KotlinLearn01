package com.fkw.kotlin.learn_01.ui.list

import android.annotation.SuppressLint
import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.fkw.kotlin.learn_01.R

class FruitListAdapter(
    activity: Activity,
    private val resource: Int,
    private val data: List<Fruit>
) : ArrayAdapter<Fruit>(activity, resource, data) {

    inner class ViewHolder(val iv: ImageView, val tv: TextView)

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view: View
        val holder: ViewHolder
        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(resource, parent, false)
            val ivIcon: ImageView = view.findViewById(R.id.iv_fruit)
            val tvFruit: TextView = view.findViewById(R.id.tv_fruit)
            holder = ViewHolder(ivIcon, tvFruit)
            view.tag = holder
        } else {
            view = convertView
            holder = view.tag as ViewHolder
        }


        val fruit = data[position]
        holder.iv.setImageResource(fruit.picId)
        holder.tv.text = fruit.name
        return view
    }


}