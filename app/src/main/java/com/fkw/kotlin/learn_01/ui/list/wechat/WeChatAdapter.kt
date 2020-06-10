package com.fkw.kotlin.learn_01.ui.list.wechat

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.fkw.kotlin.learn_01.R

class WeChatAdapter(val data: List<Msg>) : RecyclerView.Adapter<BaseHolder>() {

    override fun getItemCount(): Int {
        return data.size
    }

    override fun getItemViewType(position: Int): Int {
        return data[position].type
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseHolder =
        when (viewType) {
            Msg.TYPE_DAUGHTER -> LeftHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.item_wechat_left, parent, false)
            )
            Msg.TYPE_FATHER -> RightHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.item_wechat_right, parent, false)
            )
            else -> throw IllegalArgumentException()
        }


    override fun onBindViewHolder(holder: BaseHolder, position: Int) {
        //holder.setText(data[position].content)
        // 这里为了展示密封类，将Holder都挪到了Msg.kt中。
        // 在when中的对象如果是密封类，则不需要有else分支。
        val content = data.get(position).content
        when (holder) {
            is LeftHolder -> holder.tv.setText(content)
            is RightHolder -> holder.tv.setText(content)
        }
    }


}